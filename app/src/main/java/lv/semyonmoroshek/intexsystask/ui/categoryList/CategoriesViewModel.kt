package lv.semyonmoroshek.intexsystask.ui.categoryList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import lv.semyonmoroshek.intexsystask.data.PagingSource
import lv.semyonmoroshek.intexsystask.data.Repository
import lv.semyonmoroshek.intexsystask.data.model.CategoryItem
import lv.semyonmoroshek.intexsystask.data.network.API
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    private val repository: Repository,
) : ViewModel() {

    val loading = MutableLiveData<Boolean>(false)

    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        loading.postValue(false)
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _categoryList = MutableLiveData<List<CategoryItemUI>>()
    val categoryList: LiveData<List<CategoryItemUI>> = _categoryList

    fun getCategoryList() {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            loading.postValue(true)
            val resp = repository.getCategories()

            val categoryList: List<CategoryItemUI> = resp.map {
                CategoryItemUI(
                    shortName = it.shortName,
                    url = it.url,
                    categoryId = it.categoryId
                )
            }

            _categoryList.postValue(categoryList)

            loading.postValue(false)
        }
    }
}
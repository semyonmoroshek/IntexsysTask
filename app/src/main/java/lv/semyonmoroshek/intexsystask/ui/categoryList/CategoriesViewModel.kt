package lv.semyonmoroshek.intexsystask.ui.categoryList

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import lv.semyonmoroshek.intexsystask.data.Event
import lv.semyonmoroshek.intexsystask.data.Repository
import lv.semyonmoroshek.intexsystask.data.model.CategoryItem
import javax.inject.Inject

@HiltViewModel
class CategoriesViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
//        if (repository.hasInternetConnection.value == true) {
//        }
        repository.showError.postValue(Event(throwable.message.toString()))
//        loading.postValue(false)
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _categoryList = MutableLiveData<List<CategoryItem>>()
    val categoryList: LiveData<List<CategoryItem>> = _categoryList

    fun getCategoryList() {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _categoryList.postValue(repository.getCategories())
        }
    }

}
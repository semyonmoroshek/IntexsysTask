package lv.semyonmoroshek.intexsystask.ui.products

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import lv.semyonmoroshek.intexsystask.data.Repository
import lv.semyonmoroshek.intexsystask.data.model.Element
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    private val _loading = MutableLiveData(false)
    val loading: LiveData<Boolean> = _loading


    private val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        _loading.postValue(false)
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _productList = MutableLiveData<List<Element>>()
    val productList: LiveData<List<Element>> = _productList

    fun getProductList(categoryUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _loading.postValue(true)
            val resp = repository.getProductList(categoryUrl)
            _productList.postValue(resp)
            _loading.postValue(false)
        }
    }

}
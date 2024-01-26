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
import lv.semyonmoroshek.intexsystask.data.Event
import lv.semyonmoroshek.intexsystask.data.Repository
import lv.semyonmoroshek.intexsystask.data.model.Element
import retrofit2.http.Url
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        repository.showError.postValue(Event(throwable.message.toString()))
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _productList = MutableLiveData<List<Element>>()
    val productList: LiveData<List<Element>> = _productList

    fun getProductList(categoryUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _productList.postValue(repository.getProductList(categoryUrl))
        }
    }

}
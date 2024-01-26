package lv.semyonmoroshek.intexsystask.ui.productItem

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
import lv.semyonmoroshek.intexsystask.data.model.ProductInfoResp
import javax.inject.Inject

@HiltViewModel
class ProductItemViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        repository.showError.postValue(Event(throwable.message.toString()))
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _productInfo = MutableLiveData<ProductInfoResp>()
    val productInfo: LiveData<ProductInfoResp> = _productInfo

    fun getProductInfo(productUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _productInfo.postValue(repository.getProductInfo(productUrl))
        }
    }

}
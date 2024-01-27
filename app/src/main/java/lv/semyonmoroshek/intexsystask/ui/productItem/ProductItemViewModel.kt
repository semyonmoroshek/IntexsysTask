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
import lv.semyonmoroshek.intexsystask.data.Repository
import javax.inject.Inject

@HiltViewModel
class ProductItemViewModel @Inject constructor(
    val repository: Repository
) : ViewModel() {

    private val _loading = MutableLiveData(false)
    val loading: LiveData<Boolean> = _loading

    val coroutineExceptionHandler = CoroutineExceptionHandler { _, throwable ->
        _loading.postValue(false)
        Log.e(
            "ERR",
            "error -> ${throwable.message} - ${throwable.localizedMessage}; throwable = $throwable"
        )
    }

    private val _productInfo = MutableLiveData<ProductInfoUI>()
    val productInfo: LiveData<ProductInfoUI> = _productInfo

    fun getProductInfo(productUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _loading.postValue(true)
            val resp = repository.getProductInfo(productUrl)
            resp?.apply {
                _productInfo.postValue(
                    ProductInfoUI(
                        shortName = shortName,
                        minSalePrice = minSalePrice,
                        primaryImage = "http://images1.opticsplanet.com/365-240-ffffff/$primary_image.jpg",
                        description = description

                    )
                )
            }
            _loading.postValue(false)
        }
    }

}


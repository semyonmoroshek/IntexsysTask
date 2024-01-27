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
import javax.inject.Inject

@HiltViewModel
class ProductsViewModel @Inject constructor(
    private val repository: Repository
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

    private val _productList = MutableLiveData<List<ProductElementUI>>()
    val productList: LiveData<List<ProductElementUI>> = _productList

    fun getProductList(categoryUrl: String) {
        viewModelScope.launch(Dispatchers.IO + coroutineExceptionHandler) {
            _loading.postValue(true)
            val resp = repository.getProductList(categoryUrl)

            val productList: List<ProductElementUI> = resp.map {
                ProductElementUI(
                    fullName = it.fullName,
                    price = it.price,
                    primaryImage = "http://images1.opticsplanet.com/120-90-ffffff/${it.primaryImage}.jpg",
                    id = it.id,
                    url = it.url
                )
            }

            _productList.postValue(productList)
            _loading.postValue(false)
        }
    }

}
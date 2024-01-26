package lv.semyonmoroshek.intexsystask.data

import androidx.lifecycle.MutableLiveData
import lv.semyonmoroshek.intexsystask.data.model.CategoryItem
import lv.semyonmoroshek.intexsystask.data.model.Element
import lv.semyonmoroshek.intexsystask.data.model.ProductInfoResp
import lv.semyonmoroshek.intexsystask.data.network.API
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Repository @Inject constructor(
    val api: API
) {

    companion object {
        @Volatile
        private var instance: Repository? = null
        fun getInstance(
            api: API
        ) =
            instance ?: synchronized(this) {
                instance ?: Repository(api).also {
                    instance = it
                }
            }
    }

    var showError = MutableLiveData<Event<String>>()

    suspend fun getCategories(): List<CategoryItem> {
        val resp = api.getCategories()
        return resp.body() ?: emptyList()
    }

    suspend fun getProductList(categoryUrl: String): List<Element> {
        val resp = api.getProducts(
            url = "https://www.opticsplanet.com/iv-api/0.3/catalog/$categoryUrl/products?_iv_include=gridProducts"
        )
        val gridProducts = resp.body()?.gridProducts
        return gridProducts?.elements ?: emptyList()
    }

    suspend fun getProductInfo(productUrl: String): ProductInfoResp? {
        val resp = api.getProductInfo(
            url = "https://www.opticsplanet.com/api/0.3/products/$productUrl"
        )
        return resp.body()
    }
}
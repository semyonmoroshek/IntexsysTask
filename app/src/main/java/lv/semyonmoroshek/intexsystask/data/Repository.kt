package lv.semyonmoroshek.intexsystask.data

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

    suspend fun getCategories(): List<CategoryItem> {
        val resp = api.getCategories()
        return resp.body() ?: emptyList()
    }

    suspend fun getProductList(categoryUrl: String): List<Element> {
        val resp = api.getProducts(
            categoryUrl = categoryUrl
        )
        val gridProducts = resp.body()?.gridProducts
        return gridProducts?.elements ?: emptyList()
    }

    suspend fun getProductInfo(productUrl: String): ProductInfoResp? {
        val resp = api.getProductInfo(
            productUrl = productUrl
        )
        return resp.body()
    }
}
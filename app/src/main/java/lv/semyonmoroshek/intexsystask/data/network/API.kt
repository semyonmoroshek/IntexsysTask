package lv.semyonmoroshek.intexsystask.data.network

import lv.semyonmoroshek.intexsystask.data.model.CategoryListResp
import lv.semyonmoroshek.intexsystask.data.model.ProductInfoResp
import lv.semyonmoroshek.intexsystask.data.model.ProductListResp
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface API {

    @GET("api/0.2/categories")
    suspend fun getCategories(): Response<CategoryListResp>

    @GET
    suspend fun getProducts(
        @Url url: String
    ): Response<ProductListResp>

    @GET
    suspend fun getProductInfo(
        @Url url: String
    ): Response<ProductInfoResp>

}
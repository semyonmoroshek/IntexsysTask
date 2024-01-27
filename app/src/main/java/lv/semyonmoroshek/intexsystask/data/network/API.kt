package lv.semyonmoroshek.intexsystask.data.network

import lv.semyonmoroshek.intexsystask.data.model.CategoryListResp
import lv.semyonmoroshek.intexsystask.data.model.ProductInfoResp
import lv.semyonmoroshek.intexsystask.data.model.ProductListResp
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface API {

    @GET("api/0.2/categories")
    suspend fun getCategoriesPagging(
        @Query("page") page: Int,
        @Query("pageSize") pageSize: Int
    ): Response<CategoryListResp>

    @GET("api/0.2/categories")
    suspend fun getCategories(
    ): Response<CategoryListResp>

    @GET("iv-api/0.3/catalog/{categoryUrl}/products?_iv_include=gridProducts")
    suspend fun getProducts(
        @Path("categoryUrl") categoryUrl: String
    ): Response<ProductListResp>

    @GET("api/0.3/products/{productUrl}")
    suspend fun getProductInfo(
        @Path("productUrl") productUrl: String
    ): Response<ProductInfoResp>
}
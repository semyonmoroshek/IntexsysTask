package lv.semyonmoroshek.intexsystask.data.network

import lv.semyonmoroshek.intexsystask.data.model.CategoryListResp
import retrofit2.Response
import retrofit2.http.GET

interface API {

    @GET("categories")
    suspend fun getCategories(): Response<CategoryListResp>
}
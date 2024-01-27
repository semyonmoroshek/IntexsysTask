package lv.semyonmoroshek.intexsystask.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import lv.semyonmoroshek.intexsystask.data.model.CategoryItem
import lv.semyonmoroshek.intexsystask.data.network.API
import retrofit2.HttpException
import java.io.IOException

class PagingSource(
    private val api: API,
) : PagingSource<Int, CategoryItem>() {

    private val initialKey: Int = 0

    override fun getRefreshKey(state: PagingState<Int, CategoryItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CategoryItem> {
        return try {
            val response = api.getCategoriesPagging(params.key ?: initialKey, params.loadSize)

            val data = response.body() ?: emptyList()
            val prevKey = if (params.key == initialKey) null else params.key?.minus(1)
            val nextKey = if (data.isNotEmpty()) params.key?.plus(1) else null

            LoadResult.Page(data, prevKey, nextKey)
        } catch (e: IOException) {
            LoadResult.Error(e)
        } catch (e: HttpException) {
            LoadResult.Error(e)
        }
    }
}
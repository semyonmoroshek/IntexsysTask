package lv.semyonmoroshek.intexsystask.data.model

import com.google.gson.annotations.SerializedName

class CategoryListResp : ArrayList<CategoryItem>()

data class CategoryItem(
    @SerializedName("category_id")
    val category_id: String? = null,
    @SerializedName("featured")
    val featured: String? = null,
    @SerializedName("full_name")
    val full_name: String? = null,
    @SerializedName("has_children")
    val has_children: Boolean? = null,
    @SerializedName("images")
    val images: List<Image>? = null,
    @SerializedName("orderable_count")
    val orderable_count: String? = null,
    @SerializedName("parent_id")
    val parent_id: String? = null,
    @SerializedName("popularity")
    val popularity: String? = null,
    @SerializedName("short_name")
    val short_name: String? = null,
    @SerializedName("unavailable_count")
    val unavailable_count: String? = null,
    @SerializedName("url")
    val url: String? = null
)

data class Image(
    @SerializedName("source")
    val source: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("variant_id")
    val variant_id: Int? = null
)
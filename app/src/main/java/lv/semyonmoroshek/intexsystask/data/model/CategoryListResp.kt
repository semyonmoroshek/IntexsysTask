package lv.semyonmoroshek.intexsystask.data.model

import com.google.gson.annotations.SerializedName

class CategoryListResp : ArrayList<CategoryItem>()

data class CategoryItem(
    @SerializedName("category_id")
    val categoryId: String? = null,
    @SerializedName("featured")
    val featured: String? = null,
    @SerializedName("full_name")
    val fullName: String? = null,
    @SerializedName("has_children")
    val hasChildren: Boolean? = null,
    @SerializedName("images")
    val images: List<Image>? = null,
    @SerializedName("orderable_count")
    val orderableCount: String? = null,
    @SerializedName("parent_id")
    val parentId: String? = null,
    @SerializedName("popularity")
    val popularity: String? = null,
    @SerializedName("short_name")
    val shortName: String? = null,
    @SerializedName("unavailable_count")
    val unavailableCount: String? = null,
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
    val variantId: Int? = null
)
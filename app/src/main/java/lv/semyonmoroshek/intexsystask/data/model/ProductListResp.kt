package lv.semyonmoroshek.intexsystask.data.model

import com.google.gson.annotations.SerializedName

data class ProductListResp(
    @SerializedName("gridProducts")
    val gridProducts: GridProducts? = null,
    @SerializedName("grid_config")
    val grid_config: GridConfig? = null
)

data class GridProducts(
    @SerializedName("elements")
    val elements: List<Element>? = null
)

data class GridConfig(
    @SerializedName("size")
    val size: Int? = null
)

data class Element(
    @SerializedName("all_variants_are_outlet")
    val all_variants_are_outlet: Boolean? = null,
    @SerializedName("all_variants_are_shed")
    val all_variants_are_shed: Boolean? = null,
    @SerializedName("anchor_text")
    val anchor_text: String? = null,
    @SerializedName("blazin_deal_variant_count")
    val blazin_deal_variant_count: Int? = null,
    @SerializedName("brand")
    val brand: Brand? = null,
    @SerializedName("brand_categories")
    val brand_categories: List<Any>? = null,
    @SerializedName("brand_name")
    val brand_name: String? = null,
    @SerializedName("bundle_data")
    val bundle_data: List<Any>? = null,
    @SerializedName("buy_qty_limit")
    val buy_qty_limit: Int? = null,
    @SerializedName("buy_qty_limit_start_at")
    val buy_qty_limit_start_at: Int? = null,
    @SerializedName("can_add_qna")
    val can_add_qna: Boolean? = null,
    @SerializedName("can_add_review")
    val can_add_review: Boolean? = null,
    @SerializedName("can_compare")
    val can_compare: Boolean? = null,
    @SerializedName("categories")
    val categories: List<Category>? = null,
    @SerializedName("category_name")
    val category_name: String? = null,
    @SerializedName("clearance_variant_count")
    val clearance_variant_count: Int? = null,
    @SerializedName("deals")
    val deals: List<Any>? = null,
    @SerializedName("dimensions")
    val dimensions: Dimensions? = null,
    @SerializedName("element_dimensions")
    val element_dimensions: ElementDimensions? = null,
    @SerializedName("element_type")
    val element_type: String? = null,
    @SerializedName("flags")
    val flags: List<Any>? = null,
    @SerializedName("fullName")
    val fullName: String? = null,
    @SerializedName("ga_ecommerce_name")
    val ga_ecommerce_name: String? = null,
    @SerializedName("grid_data")
    val grid_data: GridData? = null,
    @SerializedName("grid_item_name")
    val grid_item_name: String? = null,
    @SerializedName("grid_name")
    val grid_name: String? = null,
    @SerializedName("has_options")
    val has_options: Int? = null,
    @SerializedName("has_sell_accessories_variants")
    val has_sell_accessories_variants: Boolean? = null,
    @SerializedName("highlighted_description")
    val highlighted_description: List<Any>? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("image_urls_by_type")
    val image_urls_by_type: List<Any>? = null,
    @SerializedName("is_buy_direct")
    val is_buy_direct: Boolean? = null,
    @SerializedName("is_call_to_order")
    val is_call_to_order: Int? = null,
    @SerializedName("is_made_in_usa")
    val is_made_in_usa: Int? = null,
    @SerializedName("is_members_only")
    val is_members_only: Boolean? = null,
    @SerializedName("is_orderable")
    val is_orderable: Boolean? = null,
    @SerializedName("is_outlet")
    val is_outlet: Boolean? = null,
    @SerializedName("is_price_after_rebate")
    val is_price_after_rebate: Boolean? = null,
    @SerializedName("is_saving_exact")
    val is_saving_exact: Boolean? = null,
    @SerializedName("is_segment_sale_price_hidden")
    val is_segment_sale_price_hidden: Boolean? = null,
    @SerializedName("is_shed")
    val is_shed: Boolean? = null,
    @SerializedName("item_flag_to_filter_map")
    val item_flag_to_filter_map: Any? = null,
    @SerializedName("list_price")
    val list_price: Double? = null,
    @SerializedName("main_category")
    val main_category: MainCategory? = null,
    @SerializedName("matched_variant_count")
    val matched_variant_count: Int? = null,
    @SerializedName("popularity")
    val popularity: Double? = null,
    @SerializedName("price")
    val price: Double? = null,
    @SerializedName("primaryImage")
    val primaryImage: String? = null,
    @SerializedName("product_code")
    val product_code: String? = null,
    @SerializedName("product_id")
    val product_id: Int? = null,
    @SerializedName("promotion")
    val promotion: List<Any>? = null,
    @SerializedName("review_count")
    val review_count: Int? = null,
    @SerializedName("review_rating")
    val review_rating: String? = null,
    @SerializedName("save_amount")
    val save_amount: Double? = null,
    @SerializedName("save_percent")
    val save_percent: Int? = null,
    @SerializedName("savings_text")
    val savings_text: String? = null,
    @SerializedName("short_name")
    val short_name: String? = null,
    @SerializedName("show_as_low_as")
    val show_as_low_as: Boolean? = null,
    @SerializedName("special_offers")
    val special_offers: SpecialOffersX? = null,
    @SerializedName("stores")
    val stores: List<Any>? = null,
    @SerializedName("top_specifications")
    val top_specifications: List<TopSpecificationX>? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("variant_count")
    val variant_count: Int? = null,
    @SerializedName("variant_count_text")
    val variant_count_text: Int? = null
)

data class Brand(
    @SerializedName("name")
    val name: String? = null
)

data class Category(
    @SerializedName("lev")
    val lev: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("popularity")
    val popularity: String? = null,
    @SerializedName("url")
    val url: String? = null
)

data class Dimensions(
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("width")
    val width: Int? = null
)

data class ElementDimensions(
    @SerializedName("height")
    val height: Int? = null,
    @SerializedName("width")
    val width: Int? = null
)

data class GridData(
    @SerializedName("all_variants_are_outlet")
    val all_variants_are_outlet: Boolean? = null,
    @SerializedName("all_variants_are_shed")
    val all_variants_are_shed: Boolean? = null,
    @SerializedName("anchor_text")
    val anchor_text: String? = null,
    @SerializedName("are_min_prices_after_rebate")
    val are_min_prices_after_rebate: AreMinPricesAfterRebate? = null,
    @SerializedName("are_savings_exact")
    val are_savings_exact: AreSavingsExact? = null,
    @SerializedName("are_segment_sale_prices_hidden")
    val are_segment_sale_prices_hidden: AreSegmentSalePricesHidden? = null,
    @SerializedName("brand")
    val brand: Any? = null,
    @SerializedName("cashback_flat_amount")
    val cashback_flat_amount: Int? = null,
    @SerializedName("cashback_percentage")
    val cashback_percentage: Int? = null,
    @SerializedName("categories")
    val categories: List<Category>? = null,
    @SerializedName("cents")
    val cents: String? = null,
    @SerializedName("cents_to")
    val cents_to: String? = null,
    @SerializedName("display_coupon_in_grid")
    val display_coupon_in_grid: Boolean? = null,
    @SerializedName("display_instant_rebate_grid")
    val display_instant_rebate_grid: Boolean? = null,
    @SerializedName("display_killer_deal_in_grid")
    val display_killer_deal_in_grid: Boolean? = null,
    @SerializedName("display_mail_in_rebate_grid")
    val display_mail_in_rebate_grid: Boolean? = null,
    @SerializedName("flags")
    val flags: List<Any>? = null,
    @SerializedName("force_set_primary_image_from_variant")
    val force_set_primary_image_from_variant: Boolean? = null,
    @SerializedName("free_shipping")
    val free_shipping: Int? = null,
    @SerializedName("full_name")
    val full_name: String? = null,
    @SerializedName("grid_save_percent")
    val grid_save_percent: Int? = null,
    @SerializedName("grid_save_percents")
    val grid_save_percents: GridSavePercents? = null,
    @SerializedName("has_coupons")
    val has_coupons: Int? = null,
    @SerializedName("has_free_gifts")
    val has_free_gifts: Int? = null,
    @SerializedName("has_options")
    val has_options: Int? = null,
    @SerializedName("has_sell_accessories_variants")
    val has_sell_accessories_variants: Boolean? = null,
    @SerializedName("is_best")
    val is_best: Int? = null,
    @SerializedName("is_best_rated")
    val is_best_rated: Int? = null,
    @SerializedName("is_call_to_order")
    val is_call_to_order: Int? = null,
    @SerializedName("is_clearance")
    val is_clearance: Int? = null,
    @SerializedName("is_demo")
    val is_demo: Int? = null,
    @SerializedName("is_extra_cashback")
    val is_extra_cashback: Boolean? = null,
    @SerializedName("is_made_in_usa")
    val is_made_in_usa: Int? = null,
    @SerializedName("is_min_price_after_rebate")
    val is_min_price_after_rebate: Boolean? = null,
    @SerializedName("is_new")
    val is_new: Int? = null,
    @SerializedName("is_orderable")
    val is_orderable: Int? = null,
    @SerializedName("is_outlet")
    val is_outlet: Int? = null,
    @SerializedName("is_rebate")
    val is_rebate: Int? = null,
    @SerializedName("is_sale")
    val is_sale: Int? = null,
    @SerializedName("is_saving_exact")
    val is_saving_exact: Boolean? = null,
    @SerializedName("is_second_day_air")
    val is_second_day_air: Int? = null,
    @SerializedName("is_segment_sale_price_hidden")
    val is_segment_sale_price_hidden: Int? = null,
    @SerializedName("is_shed")
    val is_shed: Int? = null,
    @SerializedName("is_use_price_per_uom_calculation")
    val is_use_price_per_uom_calculation: Boolean? = null,
    @SerializedName("list_price")
    val list_price: Double? = null,
    @SerializedName("max_final_sale_price")
    val max_final_sale_price: Double? = null,
    @SerializedName("max_final_sale_prices")
    val max_final_sale_prices: MaxFinalSalePrices? = null,
    @SerializedName("max_final_sale_prices_per_uom_number")
    val max_final_sale_prices_per_uom_number: MaxFinalSalePricesPerUomNumber? = null,
    @SerializedName("max_grid_saving")
    val max_grid_saving: Double? = null,
    @SerializedName("max_grid_savings")
    val max_grid_savings: MaxGridSavings? = null,
    @SerializedName("max_sale_price")
    val max_sale_price: Double? = null,
    @SerializedName("max_sale_prices")
    val max_sale_prices: MaxSalePrices? = null,
    @SerializedName("max_saving")
    val max_saving: Double? = null,
    @SerializedName("max_savings")
    val max_savings: MaxSavings? = null,
    @SerializedName("min_final_grid_sale_price")
    val min_final_grid_sale_price: Double? = null,
    @SerializedName("min_final_grid_sale_prices")
    val min_final_grid_sale_prices: MinFinalGridSalePrices? = null,
    @SerializedName("min_final_sale_price")
    val min_final_sale_price: Double? = null,
    @SerializedName("min_final_sale_price_uom_labels")
    val min_final_sale_price_uom_labels: MinFinalSalePriceUomLabels? = null,
    @SerializedName("min_final_sale_prices")
    val min_final_sale_prices: MinFinalSalePrices? = null,
    @SerializedName("min_final_sale_prices_per_uom_number")
    val min_final_sale_prices_per_uom_number: MinFinalSalePricesPerUomNumber? = null,
    @SerializedName("min_grid_saving")
    val min_grid_saving: Double? = null,
    @SerializedName("min_grid_savings")
    val min_grid_savings: MinGridSavings? = null,
    @SerializedName("min_sale_price")
    val min_sale_price: Double? = null,
    @SerializedName("min_sale_prices")
    val min_sale_prices: MinSalePrices? = null,
    @SerializedName("min_saving")
    val min_saving: Double? = null,
    @SerializedName("min_savings")
    val min_savings: MinSavings? = null,
    @SerializedName("popularity")
    val popularity: Double? = null,
    @SerializedName("primary_image")
    val primary_image: String? = null,
    @SerializedName("product_code")
    val product_code: String? = null,
    @SerializedName("product_id")
    val product_id: Int? = null,
    @SerializedName("promos")
    val promos: List<Any>? = null,
    @SerializedName("promotion")
    val promotion: List<Any>? = null,
    @SerializedName("promotions")
    val promotions: List<Any>? = null,
    @SerializedName("promotions_assembled")
    val promotions_assembled: List<Any>? = null,
    @SerializedName("rad_eligible")
    val rad_eligible: Boolean? = null,
    @SerializedName("rebate_amount")
    val rebate_amount: Int? = null,
    @SerializedName("review_count")
    val review_count: Int? = null,
    @SerializedName("review_rating")
    val review_rating: String? = null,
    @SerializedName("ribbon_filtering_strategy")
    val ribbon_filtering_strategy: String? = null,
    @SerializedName("ribbon_flags")
    val ribbon_flags: List<Any>? = null,
    @SerializedName("save_percent")
    val save_percent: Int? = null,
    @SerializedName("save_percents")
    val save_percents: SavePercents? = null,
    @SerializedName("short_name")
    val short_name: String? = null,
    @SerializedName("special_offers")
    val special_offers: SpecialOffers? = null,
    @SerializedName("top_specifications")
    val top_specifications: List<TopSpecification>? = null,
    @SerializedName("total_variant_count")
    val total_variant_count: Int? = null,
    @SerializedName("unorderable_type_id")
    val unorderable_type_id: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("variant_count")
    val variant_count: Int? = null,
    @SerializedName("whole")
    val whole: String? = null,
    @SerializedName("whole_to")
    val whole_to: String? = null
)

data class MainCategory(
    @SerializedName("lev")
    val lev: String? = null,
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("popularity")
    val popularity: String? = null,
    @SerializedName("url")
    val url: String? = null
)

data class SpecialOffersX(
    @SerializedName("category")
    val category: Category? = null,
    @SerializedName("is_best_rated")
    val is_best_rated: Int? = null,
    @SerializedName("is_blazin_deal")
    val is_blazin_deal: Int? = null,
    @SerializedName("is_clearance")
    val is_clearance: Int? = null,
    @SerializedName("is_coupon")
    val is_coupon: Int? = null,
    @SerializedName("is_extra_cashback")
    val is_extra_cashback: Int? = null,
    @SerializedName("is_free_gift")
    val is_free_gift: Int? = null,
    @SerializedName("is_instant_rebate")
    val is_instant_rebate: Int? = null,
    @SerializedName("is_mail_in_rebate")
    val is_mail_in_rebate: Int? = null,
    @SerializedName("is_members_only")
    val is_members_only: Int? = null,
    @SerializedName("is_new")
    val is_new: Int? = null,
    @SerializedName("is_outlet")
    val is_outlet: Int? = null,
    @SerializedName("is_sale")
    val is_sale: Int? = null,
    @SerializedName("is_seasonal")
    val is_seasonal: Int? = null,
    @SerializedName("is_second_day_air")
    val is_second_day_air: Int? = null,
    @SerializedName("is_shed")
    val is_shed: Int? = null,
    @SerializedName("primary")
    val primary: String? = null,
    @SerializedName("promotions")
    val promotions: List<Any>? = null,
    @SerializedName("special_offer_to_type")
    val special_offer_to_type: Any? = null
)

data class TopSpecificationX(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("specification_id")
    val specification_id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("values")
    val values: List<ValueX>? = null
)

data class AreMinPricesAfterRebate(
    @SerializedName("evasive")
    val evasive: Boolean? = null,
    @SerializedName("offhours")
    val offhours: Boolean? = null,
    @SerializedName("regular")
    val regular: Boolean? = null,
    @SerializedName("test_evasive")
    val test_evasive: Boolean? = null,
    @SerializedName("test_offhours")
    val test_offhours: Boolean? = null,
    @SerializedName("test_regular")
    val test_regular: Boolean? = null
)

data class AreSavingsExact(
    @SerializedName("evasive")
    val evasive: Boolean? = null,
    @SerializedName("offhours")
    val offhours: Boolean? = null,
    @SerializedName("regular")
    val regular: Boolean? = null,
    @SerializedName("test_evasive")
    val test_evasive: Boolean? = null,
    @SerializedName("test_offhours")
    val test_offhours: Boolean? = null,
    @SerializedName("test_regular")
    val test_regular: Boolean? = null
)

data class AreSegmentSalePricesHidden(
    @SerializedName("evasive")
    val evasive: Int? = null,
    @SerializedName("offhours")
    val offhours: Int? = null,
    @SerializedName("regular")
    val regular: Int? = null,
    @SerializedName("test_evasive")
    val test_evasive: Int? = null,
    @SerializedName("test_offhours")
    val test_offhours: Int? = null,
    @SerializedName("test_regular")
    val test_regular: Int? = null
)

data class GridSavePercents(
    @SerializedName("evasive")
    val evasive: Int? = null,
    @SerializedName("offhours")
    val offhours: Int? = null,
    @SerializedName("regular")
    val regular: Int? = null,
    @SerializedName("test_evasive")
    val test_evasive: Int? = null,
    @SerializedName("test_offhours")
    val test_offhours: Int? = null,
    @SerializedName("test_regular")
    val test_regular: Int? = null
)

data class MaxFinalSalePrices(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MaxFinalSalePricesPerUomNumber(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MaxGridSavings(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MaxSalePrices(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MaxSavings(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinFinalGridSalePrices(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinFinalSalePriceUomLabels(
    @SerializedName("evasive")
    val evasive: String? = null,
    @SerializedName("offhours")
    val offhours: String? = null,
    @SerializedName("regular")
    val regular: String? = null,
    @SerializedName("test_evasive")
    val test_evasive: String? = null,
    @SerializedName("test_offhours")
    val test_offhours: String? = null,
    @SerializedName("test_regular")
    val test_regular: String? = null
)

data class MinFinalSalePrices(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinFinalSalePricesPerUomNumber(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinGridSavings(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinSalePrices(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class MinSavings(
    @SerializedName("evasive")
    val evasive: Double? = null,
    @SerializedName("offhours")
    val offhours: Double? = null,
    @SerializedName("regular")
    val regular: Double? = null,
    @SerializedName("test_evasive")
    val test_evasive: Double? = null,
    @SerializedName("test_offhours")
    val test_offhours: Double? = null,
    @SerializedName("test_regular")
    val test_regular: Double? = null
)

data class SavePercents(
    @SerializedName("evasive")
    val evasive: Int? = null,
    @SerializedName("offhours")
    val offhours: Int? = null,
    @SerializedName("regular")
    val regular: Int? = null,
    @SerializedName("test_evasive")
    val test_evasive: Int? = null,
    @SerializedName("test_offhours")
    val test_offhours: Int? = null,
    @SerializedName("test_regular")
    val test_regular: Int? = null
)

data class SpecialOffers(
    @SerializedName("category")
    val category: Category? = null,
    @SerializedName("is_best_rated")
    val is_best_rated: Int? = null,
    @SerializedName("is_blazin_deal")
    val is_blazin_deal: Int? = null,
    @SerializedName("is_clearance")
    val is_clearance: Int? = null,
    @SerializedName("is_coupon")
    val is_coupon: Int? = null,
    @SerializedName("is_extra_cashback")
    val is_extra_cashback: Int? = null,
    @SerializedName("is_free_gift")
    val is_free_gift: Int? = null,
    @SerializedName("is_instant_rebate")
    val is_instant_rebate: Int? = null,
    @SerializedName("is_mail_in_rebate")
    val is_mail_in_rebate: Int? = null,
    @SerializedName("is_members_only")
    val is_members_only: Int? = null,
    @SerializedName("is_new")
    val is_new: Int? = null,
    @SerializedName("is_outlet")
    val is_outlet: Int? = null,
    @SerializedName("is_sale")
    val is_sale: Int? = null,
    @SerializedName("is_seasonal")
    val is_seasonal: Int? = null,
    @SerializedName("is_second_day_air")
    val is_second_day_air: Int? = null,
    @SerializedName("is_shed")
    val is_shed: Int? = null,
    @SerializedName("primary")
    val primary: String? = null,
    @SerializedName("promotions")
    val promotions: List<Any>? = null,
    @SerializedName("special_offer_to_type")
    val special_offer_to_type: SpecialOfferToType? = null
)

data class TopSpecification(
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("specification_id")
    val specification_id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("values")
    val values: List<Value>? = null
)

data class SpecialOfferToType(
    @SerializedName("is_best_rated")
    val is_best_rated: String? = null,
    @SerializedName("is_blazin_deal")
    val is_blazin_deal: String? = null,
    @SerializedName("is_buy_direct")
    val is_buy_direct: String? = null,
    @SerializedName("is_clearance")
    val is_clearance: String? = null,
    @SerializedName("is_coupon")
    val is_coupon: String? = null,
    @SerializedName("is_extra_cashback")
    val is_extra_cashback: String? = null,
    @SerializedName("is_final_sale")
    val is_final_sale: String? = null,
    @SerializedName("is_free_gift")
    val is_free_gift: String? = null,
    @SerializedName("is_instant_rebate")
    val is_instant_rebate: String? = null,
    @SerializedName("is_mail_in_rebate")
    val is_mail_in_rebate: String? = null,
    @SerializedName("is_members_only")
    val is_members_only: String? = null,
    @SerializedName("is_new")
    val is_new: String? = null,
    @SerializedName("is_sale")
    val is_sale: String? = null,
    @SerializedName("is_seasonal")
    val is_seasonal: String? = null,
    @SerializedName("is_second_day_air")
    val is_second_day_air: String? = null
)

data class Value(
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("specification_value_id")
    val specification_value_id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("uom")
    val uom: String? = null,
    @SerializedName("value_max")
    val value_max: String? = null,
    @SerializedName("value_min")
    val value_min: String? = null
)

data class ValueX(
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("uom")
    val uom: String? = null
)
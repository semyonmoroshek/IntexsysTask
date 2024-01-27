package lv.semyonmoroshek.intexsystask.data.model

import com.google.gson.annotations.SerializedName

data class ProductInfoResp(

  @SerializedName ("analytics_custom")
  val analytics_custom: String? = null,

  @SerializedName ("anchor_text")
  val anchor_text: String? = null,

  @SerializedName ("answer_count")
  val answer_count: Int? = null,

  @SerializedName ("are_min_prices_after_rebate")
  val are_min_prices_after_rebate: AreMinPricesAfterRebate? = null,

  @SerializedName ("are_savings_exact")
  val are_savings_exact: AreSavingsExact? = null,

  @SerializedName ("are_segment_sale_prices_hidden")
  val are_segment_sale_prices_hidden: AreSegmentSalePricesHidden? = null,

  @SerializedName ("blazinDealVariantCount")
  val blazinDealVariantCount: Int? = null,

  @SerializedName ("brand")
  val brand: Brand? = null,

  @SerializedName ("brand_id")
  val brand_id: Int? = null,

  @SerializedName ("brand_name")
  val brand_name: String? = null,

  @SerializedName ("cashback_flat_amount")
  val cashback_flat_amount: Int? = null,

  @SerializedName ("cashback_percentage")
  val cashback_percentage: Int? = null,

  @SerializedName ("categories")
  val categories: List<Category>? = null,

  @SerializedName ("category_name")
  val category_name: String? = null,

  @SerializedName ("cents")
  val cents: String? = null,

  @SerializedName ("cents_to")
  val cents_to: String? = null,

  @SerializedName ("clean_description")
  val clean_description: String? = null,

  @SerializedName ("clearanceVariantCount")
  val clearanceVariantCount: Int? = null,

  @SerializedName ("commodity_code")
  val commodity_code: String? = null,

  @SerializedName ("departments")
  val departments: List<Int>? = null,

  @SerializedName ("description")
  val description: String? = null,

  @SerializedName ("display_coupon_in_grid")
  val display_coupon_in_grid: Boolean? = null,

  @SerializedName ("display_instant_rebate_grid")
  val display_instant_rebate_grid: Boolean? = null,

  @SerializedName ("display_killer_deal_in_grid")
  val display_killer_deal_in_grid: Boolean? = null,

  @SerializedName ("display_mail_in_rebate_grid")
  val display_mail_in_rebate_grid: Boolean? = null,

  @SerializedName ("document_id")
  val document_id: String? = null,

  @SerializedName ("family_id")
  val family_id: String? = null,

  @SerializedName ("free_shipping")
  val free_shipping: Int? = null,

  @SerializedName ("full_name")
  val full_name: String? = null,

  @SerializedName ("gift_certificate")
  val gift_certificate: Int? = null,

  @SerializedName ("grid_save_percent")
  val grid_save_percent: Int? = null,

  @SerializedName ("grid_save_percents")
  val grid_save_percents: GridSavePercents? = null,

  @SerializedName ("h1_name")
  val h1_name: String? = null,

  @SerializedName ("h1_name_mobile")
  val h1_name_mobile: String? = null,

  @SerializedName ("h1_product_info")
  val h1_product_info: String? = null,

  @SerializedName ("h2_comments")
  val h2_comments: String? = null,

  @SerializedName ("h2_items")
  val h2_items: String? = null,

  @SerializedName ("h2_similar_items")
  val h2_similar_items: String? = null,

  @SerializedName ("has_coupons")
  val has_coupons: Int? = null,

  @SerializedName ("has_deals")
  val has_deals: Int? = null,

  @SerializedName ("has_evasive_pricing")
  val has_evasive_pricing: Boolean? = null,

  @SerializedName ("has_free_gifts")
  val has_free_gifts: Int? = null,

  @SerializedName ("has_manual_description")
  val has_manual_description: Int? = null,

  @SerializedName ("has_options")
  val has_options: Int? = null,

  @SerializedName ("has_sell_accessories_variants")
  val has_sell_accessories_variants: Boolean? = null,

  @SerializedName ("inverted_popularity")
  val inverted_popularity: Int? = null,

  @SerializedName ("is_available_on_op")
  val is_available_on_op: Int? = null,

  @SerializedName ("is_best")
  val is_best: Int? = null,

  @SerializedName ("is_best_rated")
  val is_best_rated: Int? = null,

  @SerializedName ("is_best_sale")
  val is_best_sale: Int? = null,

  @SerializedName ("is_call_to_order")
  val is_call_to_order: Int? = null,

  @SerializedName ("is_clearance")
  val is_clearance: Int? = null,

  @SerializedName ("is_demo")
  val is_demo: Int? = null,

  @SerializedName ("is_extra_cashback")
  val is_extra_cashback: Boolean? = null,

  @SerializedName ("is_killer_deal")
  val is_killer_deal: Int? = null,

  @SerializedName ("is_kit")
  val is_kit: Int? = null,

  @SerializedName ("is_made_in_usa")
  val is_made_in_usa: Int? = null,

  @SerializedName ("is_min_price_after_rebate")
  val is_min_price_after_rebate: Boolean? = null,

  @SerializedName ("is_new")
  val is_new: Int? = null,

  @SerializedName ("is_orderable")
  val is_orderable: Int? = null,

  @SerializedName ("is_outlet")
  val is_outlet: Int? = null,

  @SerializedName ("is_rebate")
  val is_rebate: Int? = null,

  @SerializedName ("is_sale")
  val is_sale: Int? = null,

  @SerializedName ("is_save_exact")
  val is_save_exact: Boolean? = null,

  @SerializedName ("is_saving_exact")
  val is_saving_exact: Boolean? = null,

  @SerializedName ("is_second_day_air")
  val is_second_day_air: Int? = null,

  @SerializedName ("is_segment_sale_price_hidden")
  val is_segment_sale_price_hidden: Int? = null,

  @SerializedName ("is_shed")
  val is_shed: Int? = null,

  @SerializedName ("is_show_scrolling_banner")
  val is_show_scrolling_banner: Int? = null,

  @SerializedName ("is_use_price_per_uom_calculation")
  val is_use_price_per_uom_calculation: Boolean? = null,

  @SerializedName ("js_inline")
  val js_inline: String? = null,

  @SerializedName ("js_references")
  val js_references: String? = null,

  @SerializedName ("list_price")
  val list_price: Double? = null,

  @SerializedName ("max_final_sale_price")
  val max_final_sale_price: Double? = null,

  @SerializedName ("max_grid_saving")
  val max_grid_saving: Double? = null,

  @SerializedName ("max_sale_price")
  val max_sale_price: Double? = null,

  @SerializedName ("max_saving")
  val max_saving: Double? = null,

  @SerializedName ("meta_description")
  val meta_description: String? = null,

  @SerializedName ("meta_description_mobile")
  val meta_description_mobile: String? = null,

  @SerializedName ("meta_keywords")
  val meta_keywords: String? = null,

  @SerializedName ("min_final_grid_sale_price")
  val min_final_grid_sale_price: Double? = null,

  @SerializedName ("min_final_sale_price")
  val min_final_sale_price: Double? = null,

  @SerializedName ("min_grid_saving")
  val min_grid_saving: Double? = null,

  @SerializedName ("min_sale_price")
  val minSalePrice: Double? = null,

  @SerializedName ("min_saving")
  val min_saving: Double? = null,

  @SerializedName ("original_product_flags")
  val original_product_flags: List<String>? = null,

  @SerializedName ("page_title")
  val page_title: String? = null,

  @SerializedName ("page_title_mobile")
  val page_title_mobile: String? = null,

  @SerializedName ("popularity")
  val popularity: Double? = null,

  @SerializedName ("price")
  val price: Double? = null,

  @SerializedName ("primary_image")
  val primary_image: String? = null,

  @SerializedName ("product_code")
  val product_code: String? = null,

  @SerializedName ("product_id")
  val product_id: Int? = null,

  @SerializedName ("question_count")
  val question_count: Int? = null,

  @SerializedName ("rad_eligible")
  val rad_eligible: Boolean? = null,

  @SerializedName ("raw_product")
  val raw_product: Int? = null,

  @SerializedName ("rebate_amount")
  val rebate_amount: Int? = null,

  @SerializedName ("relations")
  val relations: String? = null,

  @SerializedName ("review_count")
  val review_count: Int? = null,

  @SerializedName ("review_rating")
  val review_rating: String? = null,

  @SerializedName ("review_rating_weighted")
  val review_rating_weighted: String? = null,

  @SerializedName ("rounded_rating")
  val rounded_rating: Int? = null,

  @SerializedName ("save_amount")
  val save_amount: Double? = null,

  @SerializedName ("save_percent")
  val save_percent: Int? = null,

  @SerializedName ("savings_text")
  val savings_text: String? = null,

  @SerializedName ("short_name")
  val shortName: String? = null,

  @SerializedName ("show_as_low_as")
  val show_as_low_as: Boolean? = null,

  @SerializedName ("show_return_policy")
  val show_return_policy: Boolean? = null,

  @SerializedName ("top_specifications")
  val top_specifications: List<TopSpecification>? = null,

  @SerializedName ("total_variant_count")
  val total_variant_count: Int? = null,

  @SerializedName ("unorderable_type_id")
  val unorderable_type_id: String? = null,

  @SerializedName ("unorderable_variant_count")
  val unorderable_variant_count: Int? = null,

  @SerializedName ("url")
  val url: String? = null,

  @SerializedName ("variant_count")
  val variant_count: Int? = null,

  @SerializedName ("variantsMaxListPrice")
  val variantsMaxListPrice: Double? = null,

  @SerializedName ("version")
  val version: Int? = null,

  @SerializedName ("weight")
  val weight: Int? = null,

  @SerializedName ("whole")
  val whole: String? = null,

  @SerializedName ("whole_to")
  val whole_to: String? = null,

  @SerializedName ("all_variants_are_outlet")
  val all_variants_are_outlet: Boolean? = null,

  @SerializedName ("all_variants_are_shed")
  val all_variants_are_shed: Boolean? = null
)
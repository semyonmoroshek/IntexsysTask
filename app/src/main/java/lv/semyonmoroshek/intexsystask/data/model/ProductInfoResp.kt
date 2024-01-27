package lv.semyonmoroshek.intexsystask.data.model

import com.google.gson.annotations.SerializedName

data class ProductInfoResp(

  @SerializedName ("analytics_custom")
  val analytics_custom: String,

  @SerializedName ("anchor_text")
  val anchor_text: String,

  @SerializedName ("answer_count")
  val answer_count: Int,

  @SerializedName ("are_min_prices_after_rebate")
  val are_min_prices_after_rebate: AreMinPricesAfterRebate,

  @SerializedName ("are_savings_exact")
  val are_savings_exact: AreSavingsExact,

  @SerializedName ("are_segment_sale_prices_hidden")
  val are_segment_sale_prices_hidden: AreSegmentSalePricesHidden,

  @SerializedName ("blazinDealVariantCount")
  val blazinDealVariantCount: Int,

  @SerializedName ("brand")
  val brand: Brand,

  @SerializedName ("brand_id")
  val brand_id: Int,

  @SerializedName ("brand_name")
  val brand_name: String,

  @SerializedName ("cashback_flat_amount")
  val cashback_flat_amount: Int,

  @SerializedName ("cashback_percentage")
  val cashback_percentage: Int,

  @SerializedName ("categories")
  val categories: List<Category>,

  @SerializedName ("category_name")
  val category_name: String,

  @SerializedName ("cents")
  val cents: String,

  @SerializedName ("cents_to")
  val cents_to: String,

  @SerializedName ("clean_description")
  val clean_description: String,

  @SerializedName ("clearanceVariantCount")
  val clearanceVariantCount: Int,

  @SerializedName ("commodity_code")
  val commodity_code: String,

  @SerializedName ("departments")
  val departments: List<Int>,

  @SerializedName ("description")
  val description: String,

  @SerializedName ("display_coupon_in_grid")
  val display_coupon_in_grid: Boolean,

  @SerializedName ("display_instant_rebate_grid")
  val display_instant_rebate_grid: Boolean,

  @SerializedName ("display_killer_deal_in_grid")
  val display_killer_deal_in_grid: Boolean,

  @SerializedName ("display_mail_in_rebate_grid")
  val display_mail_in_rebate_grid: Boolean,

  @SerializedName ("document_id")
  val document_id: String,

  @SerializedName ("family_id")
  val family_id: String,

  @SerializedName ("free_shipping")
  val free_shipping: Int,

  @SerializedName ("full_name")
  val full_name: String,

  @SerializedName ("gift_certificate")
  val gift_certificate: Int,

  @SerializedName ("grid_save_percent")
  val grid_save_percent: Int,

  @SerializedName ("grid_save_percents")
  val grid_save_percents: GridSavePercents,

  @SerializedName ("h1_name")
  val h1_name: String,

  @SerializedName ("h1_name_mobile")
  val h1_name_mobile: String,

  @SerializedName ("h1_product_info")
  val h1_product_info: String,

  @SerializedName ("h2_comments")
  val h2_comments: String,

  @SerializedName ("h2_items")
  val h2_items: String,

  @SerializedName ("h2_similar_items")
  val h2_similar_items: String,

  @SerializedName ("has_coupons")
  val has_coupons: Int,

  @SerializedName ("has_deals")
  val has_deals: Int,

  @SerializedName ("has_evasive_pricing")
  val has_evasive_pricing: Boolean,

  @SerializedName ("has_free_gifts")
  val has_free_gifts: Int,

  @SerializedName ("has_manual_description")
  val has_manual_description: Int,

  @SerializedName ("has_options")
  val has_options: Int,

  @SerializedName ("has_sell_accessories_variants")
  val has_sell_accessories_variants: Boolean,

  @SerializedName ("inverted_popularity")
  val inverted_popularity: Int,

  @SerializedName ("is_available_on_op")
  val is_available_on_op: Int,

  @SerializedName ("is_best")
  val is_best: Int,

  @SerializedName ("is_best_rated")
  val is_best_rated: Int,

  @SerializedName ("is_best_sale")
  val is_best_sale: Int,

  @SerializedName ("is_call_to_order")
  val is_call_to_order: Int,

  @SerializedName ("is_clearance")
  val is_clearance: Int,

  @SerializedName ("is_demo")
  val is_demo: Int,

  @SerializedName ("is_extra_cashback")
  val is_extra_cashback: Boolean,

  @SerializedName ("is_killer_deal")
  val is_killer_deal: Int,

  @SerializedName ("is_kit")
  val is_kit: Int,

  @SerializedName ("is_made_in_usa")
  val is_made_in_usa: Int,

  @SerializedName ("is_min_price_after_rebate")
  val is_min_price_after_rebate: Boolean,

  @SerializedName ("is_new")
  val is_new: Int,

  @SerializedName ("is_orderable")
  val is_orderable: Int,

  @SerializedName ("is_outlet")
  val is_outlet: Int,

  @SerializedName ("is_rebate")
  val is_rebate: Int,

  @SerializedName ("is_sale")
  val is_sale: Int,

  @SerializedName ("is_save_exact")
  val is_save_exact: Boolean,

  @SerializedName ("is_saving_exact")
  val is_saving_exact: Boolean,

  @SerializedName ("is_second_day_air")
  val is_second_day_air: Int,

  @SerializedName ("is_segment_sale_price_hidden")
  val is_segment_sale_price_hidden: Int,

  @SerializedName ("is_shed")
  val is_shed: Int,

  @SerializedName ("is_show_scrolling_banner")
  val is_show_scrolling_banner: Int,

  @SerializedName ("is_use_price_per_uom_calculation")
  val is_use_price_per_uom_calculation: Boolean,

  @SerializedName ("js_inline")
  val js_inline: String,

  @SerializedName ("js_references")
  val js_references: String,

  @SerializedName ("list_price")
  val list_price: Double,

  @SerializedName ("max_final_sale_price")
  val max_final_sale_price: Double,

  @SerializedName ("max_grid_saving")
  val max_grid_saving: Double,

  @SerializedName ("max_sale_price")
  val max_sale_price: Double,

  @SerializedName ("max_saving")
  val max_saving: Double,

  @SerializedName ("meta_description")
  val meta_description: String,

  @SerializedName ("meta_description_mobile")
  val meta_description_mobile: String,

  @SerializedName ("meta_keywords")
  val meta_keywords: String,

  @SerializedName ("min_final_grid_sale_price")
  val min_final_grid_sale_price: Double,

  @SerializedName ("min_final_sale_price")
  val min_final_sale_price: Double,

  @SerializedName ("min_grid_saving")
  val min_grid_saving: Double,

  @SerializedName ("min_sale_price")
  val minSalePrice: Double,

  @SerializedName ("min_saving")
  val min_saving: Double,

  @SerializedName ("original_product_flags")
  val original_product_flags: List<String>,

  @SerializedName ("page_title")
  val page_title: String,

  @SerializedName ("page_title_mobile")
  val page_title_mobile: String,

  @SerializedName ("popularity")
  val popularity: Double,

  @SerializedName ("price")
  val price: Double,

  @SerializedName ("primary_image")
  val primary_image: String,

  @SerializedName ("product_code")
  val product_code: String,

  @SerializedName ("product_id")
  val product_id: Int,

  @SerializedName ("question_count")
  val question_count: Int,

  @SerializedName ("rad_eligible")
  val rad_eligible: Boolean,

  @SerializedName ("raw_product")
  val raw_product: Int,

  @SerializedName ("rebate_amount")
  val rebate_amount: Int,

  @SerializedName ("relations")
  val relations: String,

  @SerializedName ("review_count")
  val review_count: Int,

  @SerializedName ("review_rating")
  val review_rating: String,

  @SerializedName ("review_rating_weighted")
  val review_rating_weighted: String,

  @SerializedName ("rounded_rating")
  val rounded_rating: Int,

  @SerializedName ("save_amount")
  val save_amount: Double,

  @SerializedName ("save_percent")
  val save_percent: Int,

  @SerializedName ("savings_text")
  val savings_text: String,

  @SerializedName ("short_name")
  val shortName: String,

  @SerializedName ("show_as_low_as")
  val show_as_low_as: Boolean,

  @SerializedName ("show_return_policy")
  val show_return_policy: Boolean,

  @SerializedName ("top_specifications")
  val top_specifications: List<TopSpecification>,

  @SerializedName ("total_variant_count")
  val total_variant_count: Int,

  @SerializedName ("unorderable_type_id")
  val unorderable_type_id: String,

  @SerializedName ("unorderable_variant_count")
  val unorderable_variant_count: Int,

  @SerializedName ("url")
  val url: String,

  @SerializedName ("variant_count")
  val variant_count: Int,

  @SerializedName ("variantsMaxListPrice")
  val variantsMaxListPrice: Double,

  @SerializedName ("version")
  val version: Int,

  @SerializedName ("weight")
  val weight: Int,

  @SerializedName ("whole")
  val whole: String,

  @SerializedName ("whole_to")
  val whole_to: String,

  @SerializedName ("all_variants_are_outlet")
  val all_variants_are_outlet: Boolean,

  @SerializedName ("all_variants_are_shed")
  val all_variants_are_shed: Boolean
)
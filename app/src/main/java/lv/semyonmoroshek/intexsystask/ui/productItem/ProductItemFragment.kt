package lv.semyonmoroshek.intexsystask.ui.productItem

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestListener
import dagger.hilt.android.AndroidEntryPoint
import lv.semyonmoroshek.intexsystask.R
import lv.semyonmoroshek.intexsystask.databinding.FragmentProductItemBinding
import lv.semyonmoroshek.intexsystask.databinding.FragmentProductsBinding
import lv.semyonmoroshek.intexsystask.ui.categoryList.CategoriesViewModel

@AndroidEntryPoint
class ProductItemFragment : Fragment() {

    private var _binding: FragmentProductItemBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ProductItemViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductItemBinding.inflate(inflater, container, false)

        val productUrl = arguments?.getString("productUrl")

        if (viewModel.productInfo.value == null) {
            productUrl?.let { it1 -> viewModel.getProductInfo(it1) }
        }

        initObserve()

        return binding.root
    }

    private fun initObserve() {
        viewModel.productInfo.observe(viewLifecycleOwner) { product ->
            binding.txtTitle.text = product.short_name
            binding.txtPrice.text = product.min_sale_price.toString()
            binding.txtDescription.text = product.description

            val link = "http://images1.opticsplanet.com/365-240-ffffff/${product.primary_image}.jpg "
            Log.e("TTTT", "link: $link" )

            Glide.with(requireContext())
                .load(link)
                .transition(DrawableTransitionOptions.withCrossFade())
                .into(binding.img)

        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
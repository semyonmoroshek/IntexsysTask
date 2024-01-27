package lv.semyonmoroshek.intexsystask.ui.productItem

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.bumptech.glide.Glide
import dagger.hilt.android.AndroidEntryPoint
import lv.semyonmoroshek.intexsystask.databinding.FragmentProductItemBinding

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
            binding.txtTitle.text = product.shortName
            binding.txtPrice.text = "Price = ${product.minSalePrice}"

            Glide.with(requireContext())
                .load(product.primaryImage)
                .into(binding.img)

            val webSettings: WebSettings = binding.webView.settings
            webSettings.javaScriptEnabled = true

            product.description?.let { htmlCode ->
                binding.webView.loadDataWithBaseURL(null, htmlCode, "text/html", "UTF-8", null)
            }
        }

        viewModel.loading.observe(viewLifecycleOwner) { showLoading ->
            binding.loader.isVisible = showLoading
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
package lv.semyonmoroshek.intexsystask.ui.products

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import lv.semyonmoroshek.intexsystask.R
import lv.semyonmoroshek.intexsystask.databinding.FragmentProductsBinding

@AndroidEntryPoint
class ProductsFragment : Fragment() {

    private var _binding: FragmentProductsBinding? = null
    private val binding get() = _binding!!

    private val viewModel: ProductsViewModel by viewModels()

    private val adapter by lazy {
        ProductsAdapter(
            openProduct = { productUrl ->
                val bundle = Bundle()
                bundle.putString("productUrl", productUrl)
                findNavController().navigate(R.id.productItemFragment, bundle)

            }
        )
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentProductsBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = adapter

        val categoryUrl = arguments?.getString("categoryUrl")

        if (viewModel.productList.value.isNullOrEmpty()) {
            categoryUrl?.let { viewModel.getProductList(it) }
        }

        initObserver()

        return binding.root
    }

    private fun initObserver() {
        viewModel.productList.observe(viewLifecycleOwner) { categoryList ->
            categoryList?.let {
                adapter.setData(it)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
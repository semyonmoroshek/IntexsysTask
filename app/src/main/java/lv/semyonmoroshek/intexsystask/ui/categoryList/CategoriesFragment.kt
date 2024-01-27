package lv.semyonmoroshek.intexsystask.ui.categoryList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import lv.semyonmoroshek.intexsystask.R
import lv.semyonmoroshek.intexsystask.databinding.FragmentCategoriesBinding

@AndroidEntryPoint
class CategoriesFragment : Fragment() {

    private var _binding: FragmentCategoriesBinding? = null
    private val binding get() = _binding!!

    private val viewModel: CategoriesViewModel by viewModels()

    private val adapter by lazy {
        CategoriesAdapter(
            openCategory = { categoryUrl ->
                val bundle = Bundle()
                bundle.putString("categoryUrl", categoryUrl)
                findNavController().navigate(R.id.productsFragment, bundle)
            }
        )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCategoriesBinding.inflate(inflater, container, false)

        binding.recyclerView.adapter = adapter

        if (viewModel.categoryList.value == null) {
            viewModel.getCategoryList()
        }

        initObserver()

        return binding.root
    }

    private fun initObserver() {
        viewModel.categoryList.observe(viewLifecycleOwner) { list ->
            adapter.setData(list)
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
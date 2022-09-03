package com.udacity.shoestore.ui.shoesList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import coil.load
import coil.transform.CircleCropTransformation
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeListLayoutBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ShoesListFragment : Fragment() {

    private val binding: ShoeListLayoutBinding by lazy {
        ShoeListLayoutBinding.inflate(layoutInflater)
    }

    private val viewModel: ShoesListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        binding.fabAddShoe.setOnClickListener {
            findNavController().navigate(R.id.action_shoesListFragment_to_shoeDetailFragment)
        }
        binding.topAppBar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.logout -> {
                    findNavController().navigate(R.id.action_shoesListFragment_to_loginFragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun setupRecyclerView() {
        lifecycleScope.launch {
            viewModel.shoes.collectLatest { shoes ->
                shoes.forEach { shoe ->
                    binding.shoe = shoe
                    val image = ImageView(requireContext()).apply {
                        load(
                            shoe.images[0]
                        ) {
                            crossfade(true)
                            placeholder(R.drawable.ic_baseline_error_24)
                            transformations(CircleCropTransformation())
                            error(R.drawable.ic_baseline_error_24)
                        }
                        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    val name = TextView(requireContext()).apply {
                        text = shoe.name
                        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    val size = TextView(requireContext()).apply {
                        text = shoe.size.toString()
                        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    val company = TextView(requireContext()).apply {
                        text = shoe.company
                        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    val description = TextView(requireContext()).apply {
                        text = shoe.description
                        layoutParams = ViewGroup.LayoutParams(MATCH_PARENT, WRAP_CONTENT)
                    }
                    binding.shoeListLayout.run {
                        addView(image)
                        addView(name)
                        addView(size)
                        addView(company)
                        addView(description)
                    }
                }
            }
        }
    }
}
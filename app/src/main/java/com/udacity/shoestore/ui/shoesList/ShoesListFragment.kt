package com.udacity.shoestore.ui.shoesList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.ShoeListLayoutBinding
import com.udacity.shoestore.ui.shoesList.adapter.ShoeListAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

@AndroidEntryPoint
class ShoesListFragment : Fragment() {

    private lateinit var binding: ShoeListLayoutBinding

    private val viewModel: ShoesListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShoeListLayoutBinding.inflate(inflater, container, false)
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
                    findNavController().popBackStack()
                    true
                }
                else -> false
            }
        }
    }

    private fun setupRecyclerView() {
        lifecycleScope.launch {
            viewModel.shoes.collectLatest { shoes ->
                binding.shoesRecyclerView.apply {
                    adapter = ShoeListAdapter(shoes, requireContext())
                    addItemDecoration(
                        DividerItemDecoration(
                            requireContext(),
                            DividerItemDecoration.HORIZONTAL
                        )
                    )
                    addItemDecoration(
                        DividerItemDecoration(
                            requireContext(),
                            DividerItemDecoration.VERTICAL
                        )
                    )
                }
            }
        }
    }
}
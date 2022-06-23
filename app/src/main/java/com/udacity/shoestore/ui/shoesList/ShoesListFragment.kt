package com.udacity.shoestore.ui.shoesList

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.udacity.shoestore.databinding.ShoeListLayoutBinding
import com.udacity.shoestore.ui.shoesList.adapter.ShoeListAdapter
import dagger.hilt.android.AndroidEntryPoint

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
        viewModel.getShoes()
        binding.shoesRecyclerView.apply {
            adapter = ShoeListAdapter(listOf(), requireContext())
        }
    }
}
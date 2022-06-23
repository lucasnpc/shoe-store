package com.udacity.shoestore.ui.shoeDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.udacity.shoestore.databinding.ShoeDetailLayoutBinding
import com.udacity.shoestore.ui.shoesList.ShoesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoeDetailFragment : Fragment() {

    lateinit var binding: ShoeDetailLayoutBinding

    private val viewModel: ShoesViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ShoeDetailLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}
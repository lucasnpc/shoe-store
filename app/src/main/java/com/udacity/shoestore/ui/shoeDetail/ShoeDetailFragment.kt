package com.udacity.shoestore.ui.shoeDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.udacity.shoestore.databinding.ShoeDetailLayoutBinding
import com.udacity.shoestore.domain.models.Shoe
import com.udacity.shoestore.util.validateEmptyField
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShoeDetailFragment : Fragment() {

    lateinit var binding: ShoeDetailLayoutBinding

    private val viewModel: ShoeDetailsViewModel by viewModels()

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
        binding.buttonSave.setOnClickListener {
            saveShoe()
        }
    }

    private fun saveShoe() {
        with(binding) {
            when {
                texfieldName.editText?.text?.isEmpty() == true ->
                    texfieldName.editText?.validateEmptyField(requireContext())

                texfieldName.editText?.text?.isEmpty() == true ->
                    texfieldName.editText?.validateEmptyField(requireContext())

                texfieldSize.editText?.text?.isEmpty() == true ->
                    texfieldSize.editText?.validateEmptyField(requireContext())

                texfieldCompany.editText?.text?.isEmpty() == true ->
                    texfieldCompany.editText?.validateEmptyField(requireContext())

                texfieldDescription.editText?.text?.isEmpty() == true ->
                    texfieldDescription.editText?.validateEmptyField(requireContext())

                texfieldImage.editText?.text?.isEmpty() == true ->
                    texfieldImage.editText?.validateEmptyField(requireContext())

                else -> {
                    val shoe = Shoe(
                        name = texfieldName.editText?.text.toString(),
                        size = texfieldSize.editText?.text.toString().toDouble(),
                        company = texfieldCompany.editText?.text.toString(),
                        description = texfieldDescription.editText?.text.toString(),
                        images = listOf(texfieldImage.editText?.text.toString())
                    )
                    viewModel.addShoe(shoe)
                    findNavController().popBackStack()
                }
            }
        }
    }
}

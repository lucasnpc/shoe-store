package com.udacity.shoestore.ui.shoeDetail

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.domain.data.ShoesRepository
import com.udacity.shoestore.domain.models.Shoe
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShoeDetailsViewModel @Inject constructor(private val repository: ShoesRepository) :
    ViewModel() {

    fun addShoe(shoe: Shoe) {
        repository.addShoe(shoe)
    }
}

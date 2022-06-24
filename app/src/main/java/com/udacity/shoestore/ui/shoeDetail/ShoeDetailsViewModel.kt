package com.udacity.shoestore.ui.shoeDetail

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.domain.models.Shoe
import com.udacity.shoestore.domain.useCases.ShoeStoreUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShoeDetailsViewModel @Inject constructor(private val shoeStoreUseCases: ShoeStoreUseCases) :
    ViewModel() {

    fun addShoe(shoe: Shoe) {
        shoeStoreUseCases.addShoeUseCase(shoe)
    }
}

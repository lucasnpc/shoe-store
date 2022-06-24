package com.udacity.shoestore.domain.useCases

import com.udacity.shoestore.domain.data.ShoesRepository
import com.udacity.shoestore.domain.models.Shoe

class AddShoeUseCase(private val repository: ShoesRepository) {
    operator fun invoke(shoe: Shoe) {
        repository.addShoe(shoe)
    }
}
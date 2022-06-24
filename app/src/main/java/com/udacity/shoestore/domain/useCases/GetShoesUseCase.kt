package com.udacity.shoestore.domain.useCases

import com.udacity.shoestore.domain.data.ShoesRepository

class GetShoesUseCase(private val repository: ShoesRepository) {
    operator fun invoke() = repository.getShoes()
}
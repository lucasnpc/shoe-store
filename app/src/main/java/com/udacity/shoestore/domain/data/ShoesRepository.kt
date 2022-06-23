package com.udacity.shoestore.domain.data

import com.udacity.shoestore.domain.models.Shoe

interface ShoesRepository {
    fun getShoes(): ArrayList<Shoe>
    fun addShoe(shoe: Shoe)
}
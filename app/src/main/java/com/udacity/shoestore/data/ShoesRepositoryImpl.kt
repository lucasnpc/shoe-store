package com.udacity.shoestore.data

import com.udacity.shoestore.util.ShoesList
import com.udacity.shoestore.domain.data.ShoesRepository
import com.udacity.shoestore.domain.models.Shoe

class ShoesRepositoryImpl : ShoesRepository {

    private val shoes: ArrayList<Shoe> = ShoesList.getShoes()

    override fun getShoes() = shoes

    override fun addShoe(shoe: Shoe) {
        shoes.add(shoe)
    }
}
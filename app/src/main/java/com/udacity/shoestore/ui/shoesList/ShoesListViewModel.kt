package com.udacity.shoestore.ui.shoesList

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.domain.data.ShoesRepository
import com.udacity.shoestore.domain.models.Shoe
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ShoesListViewModel @Inject constructor(private val repository: ShoesRepository) :
    ViewModel() {

    fun getShoes(): ArrayList<Shoe> {
        return repository.getShoes()
    }

}

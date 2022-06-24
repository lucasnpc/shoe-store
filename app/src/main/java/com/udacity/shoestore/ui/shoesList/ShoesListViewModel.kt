package com.udacity.shoestore.ui.shoesList

import androidx.lifecycle.ViewModel
import com.udacity.shoestore.domain.models.Shoe
import com.udacity.shoestore.domain.useCases.ShoeStoreUseCases
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class ShoesListViewModel @Inject constructor(shoeStoreUseCases: ShoeStoreUseCases) :
    ViewModel() {

    private val _shoes = MutableStateFlow<List<Shoe>>(listOf())
    val shoes: StateFlow<List<Shoe>> = _shoes

    init {
        _shoes.value = shoeStoreUseCases.getShoesUseCase()
    }

}

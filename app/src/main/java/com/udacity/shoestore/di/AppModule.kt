package com.udacity.shoestore.di

import com.udacity.shoestore.data.ShoesRepositoryImpl
import com.udacity.shoestore.domain.data.ShoesRepository
import com.udacity.shoestore.domain.useCases.AddShoeUseCase
import com.udacity.shoestore.domain.useCases.GetShoesUseCase
import com.udacity.shoestore.domain.useCases.ShoeStoreUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Singleton
    @Provides
    fun providesShoesRepository(): ShoesRepository = ShoesRepositoryImpl()

    @Singleton
    @Provides
    fun provideUseCases(repository: ShoesRepository): ShoeStoreUseCases =
        ShoeStoreUseCases(
            getShoesUseCase = GetShoesUseCase(repository),
            addShoeUseCase = AddShoeUseCase(repository)
        )
}
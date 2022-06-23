package com.udacity.shoestore.di

import com.udacity.shoestore.data.ShoesRepositoryImpl
import com.udacity.shoestore.domain.data.ShoesRepository
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
}
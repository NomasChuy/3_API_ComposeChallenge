package com.example.composeapp.core.di

import com.example.composeapp.data.repository.CocktailsRepositoryImpl
import com.example.composeapp.data.repository.IngredientRepositoryImpl
import com.example.composeapp.data.repository.MoviesRepositoryImpl
import com.example.composeapp.data.repository.ImageAndStringRepositoryImpl
import com.example.composeapp.domain.repository.ImageAndStringRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
//-
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    @RickAndMorty
    abstract fun bindsRickAndMortyRepository(impl : ImageAndStringRepositoryImpl) : ImageAndStringRepository

    @Binds
    @Singleton
    @Cocktails
    abstract fun bindsCocktailsRepository(impl: CocktailsRepositoryImpl) : ImageAndStringRepository

    @Binds
    @Singleton
    @Movies
    abstract fun bindsMoviesRepository(impl: MoviesRepositoryImpl) : ImageAndStringRepository
}
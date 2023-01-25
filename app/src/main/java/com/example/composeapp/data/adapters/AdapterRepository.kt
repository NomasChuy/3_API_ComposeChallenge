package com.example.composeapp.data.adapters

import com.example.composeapp.domain.repository.ImageAndStringRepository
import javax.inject.Inject

class AdapterRepository @Inject constructor(
    private val rickAndMortyRepository: ImageAndStringRepository,
    private val ingredientRepository: ImageAndStringRepository,
    private val cocktailsRepository: ImageAndStringRepository
){
    fun getInstance(typeRepository : TypeRepository){
        when(typeRepository){
            TypeRepository.Cocktails -> TODO()
            TypeRepository.Movies -> TODO()
            TypeRepository.RickAndMorty -> TODO()
        }
    }
}

sealed class TypeRepository{
    object RickAndMorty : TypeRepository()
    object Cocktails : TypeRepository()
    object Movies : TypeRepository()
}
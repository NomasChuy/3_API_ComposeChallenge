package com.example.composeapp.data.repository

import com.example.composeapp.core.utils.Resource
import com.example.composeapp.data.apis.RickAndMortyAPI
import com.example.composeapp.domain.models.ImageAndStringObject
import com.example.composeapp.domain.repository.ImageAndStringRepository
import javax.inject.Inject

//-
class ImageAndStringRepositoryImpl @Inject constructor(private val rickAndMortyAPI: RickAndMortyAPI) :
    ImageAndStringRepository {
    override fun fetchImageAndStringList(): Resource<List<ImageAndStringObject>> {
        TODO("Not yet implemented")
    }

}
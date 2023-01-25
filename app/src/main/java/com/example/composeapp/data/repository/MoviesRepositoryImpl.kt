package com.example.composeapp.data.repository

import com.example.composeapp.core.utils.Resource
import com.example.composeapp.data.apis.MoviesAPI
import com.example.composeapp.domain.models.ImageAndStringObject
import com.example.composeapp.domain.repository.ImageAndStringRepository
import javax.inject.Inject
//-
class MoviesRepositoryImpl @Inject constructor(moviesAPI: MoviesAPI) : ImageAndStringRepository {
    override fun fetchImageAndStringList(): Resource<List<ImageAndStringObject>> {
        TODO("Not yet implemented")
    }

}
package com.example.composeapp.domain.repository

import com.example.composeapp.core.utils.Resource
import com.example.composeapp.domain.models.ImageAndStringObject

interface ImageAndStringRepository {
    fun fetchImageAndStringList() : Resource<List<ImageAndStringObject>>
}
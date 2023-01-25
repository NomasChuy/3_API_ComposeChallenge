package com.example.composeapp.data.apis

import com.example.composeapp.data.models.rickmorty.CharacterList
import retrofit2.Response
import retrofit2.http.GET

interface RickAndMortyAPI {
    @GET("character")
    fun getCharacters() : Response<CharacterList>
}
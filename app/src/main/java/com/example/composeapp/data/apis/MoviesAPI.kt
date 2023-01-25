package com.example.composeapp.data.apis

import com.example.composeapp.data.models.movies.MovieList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {
    @GET("now_playing")
    fun getMovies(
        @Query("now_playing") apiKey: String,
        @Query("region") region: String
    ): Response<MovieList>
}
package com.example.composeapp.data.apis

import com.example.composeapp.data.models.cocktails.CocktailList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CocktailsAPI {
    @GET("filter.php")
    fun getCocktails(@Query("i") i : String) : Response<CocktailList>
}
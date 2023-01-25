package com.example.composeapp.data.apis

import com.example.composeapp.data.models.ingredients.IngredientList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface IngredientsAPI {
    @GET("list.php")
    fun getIngredients(@Query("i") i : String) : Response<IngredientList>
}
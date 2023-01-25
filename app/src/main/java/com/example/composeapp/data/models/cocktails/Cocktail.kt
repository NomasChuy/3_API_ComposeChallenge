package com.example.composeapp.data.models.cocktails


import com.google.gson.annotations.SerializedName

data class Cocktail(
    @SerializedName("idDrink")
    val idCocktail: String,
    @SerializedName("strDrink")
    val strCocktail: String,
    @SerializedName("strDrinkThumb")
    val strCocktailThumb: String
)
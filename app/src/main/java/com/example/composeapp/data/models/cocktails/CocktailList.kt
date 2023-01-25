package com.example.composeapp.data.models.cocktails


import com.google.gson.annotations.SerializedName

data class CocktailList(
    @SerializedName("drinks")
    val cocktailList: List<Cocktail>
)
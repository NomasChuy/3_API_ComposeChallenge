package com.example.composeapp.data.models.ingredients


import com.google.gson.annotations.SerializedName

data class IngredientList(
    @SerializedName("drinks")
    val drinks: List<Ingredient>
)
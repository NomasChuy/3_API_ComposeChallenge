package com.example.composeapp.data.models.rickmorty


import com.google.gson.annotations.SerializedName

data class CharacterList(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val characters: List<Character>
)
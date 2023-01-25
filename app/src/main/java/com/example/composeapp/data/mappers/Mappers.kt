package com.example.composeapp.data.mappers

import com.example.composeapp.data.models.cocktails.Cocktail
import com.example.composeapp.data.models.movies.Movie
import com.example.composeapp.data.models.rickmorty.Character
import com.example.composeapp.domain.models.ImageAndStringObject
//-
fun Character.toDomainStringAndImage() : ImageAndStringObject{
    return ImageAndStringObject(
        string = this.name,
        image = this.image
    )
}


fun Cocktail.toDomainStringAndImage() : ImageAndStringObject{
    return ImageAndStringObject(
        string = this.strCocktail,
        image = this.strCocktailThumb
    )
}

fun Movie.toDomainStringAndImage() : ImageAndStringObject{
    return ImageAndStringObject(
        string = this.title,
        image = this.posterPath
    )
}

package com.example.composeapp.core.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class RickAndMorty

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Cocktails

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Movies

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Ingredients
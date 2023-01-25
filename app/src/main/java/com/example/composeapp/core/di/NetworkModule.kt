package com.example.composeapp.core.di

import com.example.composeapp.data.apis.CocktailsAPI
import com.example.composeapp.data.apis.IngredientsAPI
import com.example.composeapp.data.apis.MoviesAPI
import com.example.composeapp.data.apis.RickAndMortyAPI
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun providesOkHttpClient() : OkHttpClient =
        OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun providesRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl("")
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    @RickAndMorty
    fun providesRickAndMortyAPI(retrofit: Retrofit) : RickAndMortyAPI =
        retrofit.create(RickAndMortyAPI::class.java)

    @Provides
    @Singleton
    @Ingredients
    fun providesIngredientsAPI(retrofit: Retrofit) : IngredientsAPI =
        retrofit.create(IngredientsAPI::class.java)

    @Provides
    @Singleton
    @Cocktails
    fun providesCocktailsAPI(retrofit: Retrofit) : CocktailsAPI =
        retrofit.create(CocktailsAPI::class.java)

    @Provides
    @Singleton
    @Movies
    fun providesMoviesAPI(retrofit: Retrofit) : MoviesAPI =
        retrofit.create(MoviesAPI::class.java)

}
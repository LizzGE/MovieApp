package com.cursosant.movieapp.repository

import com.cursosant.movieapp.application.AppConstants
import com.cursosant.movieapp.data.model.MovieList
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header

interface WebService {

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(@Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0MzFhMDdhN2E1ZWEyM2I4Y2EwNjc2OWY2OWZiZTVhZCIsIm5iZiI6MTc0ODk5MDgzNS4wMzUsInN1YiI6IjY4M2Y3YjczMGRjYjg0ZWE1YzdmNGIzOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.C2AzNREaBmDSeCjh5Pi3HSUBjLo8g813KL_47OH83aM"
    ): MovieList

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(@Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0MzFhMDdhN2E1ZWEyM2I4Y2EwNjc2OWY2OWZiZTVhZCIsIm5iZiI6MTc0ODk5MDgzNS4wMzUsInN1YiI6IjY4M2Y3YjczMGRjYjg0ZWE1YzdmNGIzOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.C2AzNREaBmDSeCjh5Pi3HSUBjLo8g813KL_47OH83aM"
    ): MovieList
    @GET("movie/popular")
    suspend fun getPopularMovies(@Header("Authorization") token: String = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiI0MzFhMDdhN2E1ZWEyM2I4Y2EwNjc2OWY2OWZiZTVhZCIsIm5iZiI6MTc0ODk5MDgzNS4wMzUsInN1YiI6IjY4M2Y3YjczMGRjYjg0ZWE1YzdmNGIzOCIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.C2AzNREaBmDSeCjh5Pi3HSUBjLo8g813KL_47OH83aM"
    ): MovieList
}

object RetrofitClient {

    val webservice by lazy {
        Retrofit.Builder()
            .baseUrl(AppConstants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().create()))
            .build().create(WebService::class.java)
    }
}
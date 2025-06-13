package com.cursosant.movieapp.data.remote

import com.cursosant.movieapp.application.AppConstants
import com.cursosant.movieapp.data.model.MovieList
import com.cursosant.movieapp.repository.WebService

class MovieDataSource(private val webService: WebService) {

    suspend fun getUpcomingMovies(): MovieList = webService.getUpcomingMovies(AppConstants.TOKEN)

    suspend fun getTopRatedMovies(): MovieList = webService.getTopRatedMovies(AppConstants.TOKEN)

    suspend fun getPopularMovies(): MovieList = webService.getPopularMovies(AppConstants.TOKEN)
}
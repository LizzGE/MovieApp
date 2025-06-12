package com.cursosant.movieapp.repository

import com.cursosant.movieapp.data.model.MovieList


interface MovieRepository {

    suspend fun getUpcomingMovies(): MovieList
    suspend fun getTopRatedMovies(): MovieList
    suspend fun getPopularMovies(): MovieList

}
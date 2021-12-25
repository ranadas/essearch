package com.rdas.es.service

import com.rdas.es.model.Film
import com.rdas.es.model.Movie
import com.rdas.es.model.SearchResponse

interface MovieDBSearchService {
    fun getAllMovies(): List<Film>

    fun getDocument(id: String): Movie

    fun searchByTitle(title: String, pageNum: Int, limit: Int): SearchResponse

    fun saveAll(movies: List<Film>)
}
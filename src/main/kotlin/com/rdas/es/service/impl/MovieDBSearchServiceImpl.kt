package com.rdas.es.service.impl

import com.rdas.es.elasticrepository.MovieRepository
import com.rdas.es.model.Film
import com.rdas.es.model.Movie
import com.rdas.es.model.SearchResponse
import com.rdas.es.service.MovieDBSearchService
import org.springframework.stereotype.Service

@Service
class MovieDBSearchServiceImpl( val movieRepository: MovieRepository) : MovieDBSearchService {
    override fun getDocument(id: String): Movie {
        TODO("Not yet implemented")
    }

    override fun searchByTitle(title: String, pageNum: Int, limit: Int): SearchResponse {
        TODO("Not yet implemented")
    }

    override fun getAllMovies(): List<Film> {
        return movieRepository.findAll().toList()
    }

    override fun saveAll(films: List<Film>) {
        movieRepository.saveAll(films)
    }
}
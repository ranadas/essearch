package com.rdas.es.service.impl

import com.rdas.es.elasticrepository.MovieRepository
import com.rdas.es.model.Film
import com.rdas.es.model.Movie
import com.rdas.es.model.SearchResponse
import com.rdas.es.service.MovieDBSearchService
import org.slf4j.LoggerFactory
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service


@Service
class MovieDBSearchServiceImpl(val movieRepository: MovieRepository) : MovieDBSearchService {

    private val logger = LoggerFactory.getLogger(MovieDBSearchServiceImpl::class.java)
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

    override fun searchByDirector(director: String): List<Film> {
        val of = PageRequest.of(0, 10)
        val filmByDirectorName: List<Film> =
            movieRepository.findByDirector(director)
        logger.info("filmByDirectorName : $filmByDirectorName")
        return filmByDirectorName
    }

    override fun searchByTitle(title: String): List<Film> {
        return movieRepository.findByTitle(title)
    }
}
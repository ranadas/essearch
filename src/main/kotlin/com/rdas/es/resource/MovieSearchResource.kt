package com.rdas.es.resource

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.rdas.es.model.Film
import com.rdas.es.model.Movie
import com.rdas.es.model.SearchResponse
import com.rdas.es.service.MovieDBSearchService
import lombok.extern.slf4j.Slf4j
import org.slf4j.LoggerFactory.getLogger
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.io.*
import com.fasterxml.jackson.module.kotlin.readValue

/**
 * Restful API to search Movies
 */
@Slf4j
@RestController
@RequestMapping("/movie")
class MovieSearchResource {

    companion object {
        private val loggerWithExplicitClass = getLogger(MovieSearchResource::class.java)
    }

    @Autowired
    lateinit var movieDBSearchService: MovieDBSearchService

    @GetMapping("/hello")
    fun respondHello(): String {
        return "Hello, World"
    }

    @GetMapping("/titleSearch")
    fun searchByTitle(@RequestParam query: String): SearchResponse {
        TODO ("yet to be implemented")
    }

    @GetMapping("/list")
    fun getAllFilms(): List<Film> {
        return movieDBSearchService.getAllMovies()
    }

    @PostMapping("/add/all")
    fun handleFileUpload(@RequestParam("file") file: MultipartFile) {
        loggerWithExplicitClass.info("File Received")

        val kotlinModule: KotlinModule = KotlinModule.Builder()
            .build()
        val mapper = ObjectMapper().registerModule(kotlinModule)


        var films: List<Film> = mapper.readValue(file.bytes)
        loggerWithExplicitClass.info("saving films ${films.size}")

        movieDBSearchService.saveAll(films)
    }
}
package com.rdas.es.resource

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

/**
 * Restful API to search Movies
 */
@RestController
@RequestMapping("/movie")
class MovieSearchResource {

    @GetMapping("/hello")
    fun respondHello(): String {
        return "Hello, World"
    }
//
//    @GetMapping("/titleSearch")
//    public  searchByTitle(@RequestParam  val query: String): SearchResponse {
//
//    }
}
package com.rdas.es.elasticrepository

import com.rdas.es.model.Film
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface MovieRepository: ElasticsearchRepository<Film, String> {

//    fun findByDirector(director: String, pageable: Pageable) : Page<Film>
    fun findByDirector(director: String) : List<Film>
    fun findByTitle(title: String) : List<Film>
}
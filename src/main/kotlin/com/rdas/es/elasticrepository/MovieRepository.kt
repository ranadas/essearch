package com.rdas.es.elasticrepository

import com.rdas.es.model.Film
import com.rdas.es.model.Movie
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface MovieRepository: ElasticsearchRepository<Film, String> {
}
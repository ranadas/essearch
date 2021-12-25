package com.rdas.es.elasticrepository

import com.rdas.es.model.Movie
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository

interface MovieRepository: ElasticsearchRepository<Movie, String> {
}
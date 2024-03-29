package com.rdas.es.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field

@Document(indexName = "movie-index")
data class Movie(
    @Id
    val id: String,
    @JsonProperty("original_title")
    @Field("original_title")
    val originalTitle: String,
    val year: String,
    val genre: String,
    val duration: Double,
    val country: String,
    val language: String,
    val director: String,
    val writer: String,
    @JsonProperty("production_company")
    @Field("production_company")
    val productionCompany: String,
    val actors: String,
    val description: String,
    @JsonProperty("avg_vote")
    @Field("avg_vote")
    val avgVote: Double,
    val votes: Double
)
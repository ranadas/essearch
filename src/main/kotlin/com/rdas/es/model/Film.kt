package com.rdas.es.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field

@Document(indexName = "movie-index")
data class Film (
    @Id
    @JsonProperty("imdb_title_id")
    @Field("imdb_title_id")
    val id: String,
//    val imdb_title_id: String,
    val title: String,
    @JsonProperty("original_title")
    @Field("original_title")
    val originalTitle: String,
    val year : Int= 0,
    val genre: String,
    val duration: Int,
    val country: String,
    val language: String,
    val director: String,
    val writer: String,
    @JsonProperty("production_company")
    @Field("production_company")
    val productionCompany: String,
    val actors: String,
    val description: String,
    val avg_vote : Double,
    val votes: Int,
    @JsonProperty("reviews_from_users")
    @Field("reviews_from_users")
    val reviewsFromUsers: Int,
    @JsonProperty("reviews_from_critics")
    @Field("reviews_from_critics")
    val reviewsFromCritics: Int
)
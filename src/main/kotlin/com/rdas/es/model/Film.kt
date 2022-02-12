package com.rdas.es.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "movie-index")
data class Film (
    @Id
    @JsonProperty("imdb_title_id")
    @Field(name = "imdb_title_id", type = FieldType.Keyword)
    val id: String,
    val title: String,
    @JsonProperty("original_title")
    @Field(name = "original_title", type = FieldType.Keyword)
    val originalTitle: String,
    val year : Int= 0,
    val genre: String,
    val duration: Int,
    @Field(name = "country", type = FieldType.Keyword)
    val country: String,
    val language: String,
    @Field(name = "director", type = FieldType.Keyword)
    val director: String,
    @Field(name = "writer", type = FieldType.Keyword)
    val writer: String,
    @JsonProperty("production_company")
    @Field("production_company")
    val productionCompany: String,
    @Field(name = "actors", type = FieldType.Keyword)
    val actors: String,
    @Field(name = "description", type = FieldType.Keyword)
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
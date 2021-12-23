package com.rdas.es.model

import com.fasterxml.jackson.annotation.JsonProperty

data class SearchResponse(
    @JsonProperty("total_hits")
    val totalHits: Long,
    val suggestions: List<Suggestion>
)
package com.rdas.es.service.impl

import com.fasterxml.jackson.core.JsonParser
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.kotlin.readValue
import com.rdas.es.model.Film
import org.junit.jupiter.api.Test
import java.io.File

class MovieDBSearchServiceImplTest {
    @Test
    fun whenCalled_ControllerIsNotNull() {
        1 == 1

        var fileName = "data/movies-small.json"
        //readFileLineByLineUsingForEachLine(fileName)
        parseStrung2Json(fileName)
    }

    fun readFileLineByLineUsingForEachLine(fileName: String) = File(fileName).forEachLine { println(it) }

    fun parseStrung2Json(fileName: String) {

        val kotlinModule: KotlinModule = KotlinModule.Builder()
            .build()
        val mapper = ObjectMapper().registerModule(kotlinModule)
        mapper.configure(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS, true)
        var json = readFileDirectlyAsText(fileName)
        var films: List<Film> = mapper.readValue(json)

        //println(films)

        var titles = films
            .asSequence()
            .filter { it.title.startsWith("T") }
            .map{it.title}
        for (t in titles) println(t)
    }

    fun readFileDirectlyAsText(fileName: String): String
            = File(fileName).readText(Charsets.UTF_8)

}
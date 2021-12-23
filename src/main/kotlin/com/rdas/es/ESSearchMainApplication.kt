package com.rdas.es

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ESSearchMainApplication

fun main(args: Array<String>) {
	runApplication<ESSearchMainApplication>(*args)
}

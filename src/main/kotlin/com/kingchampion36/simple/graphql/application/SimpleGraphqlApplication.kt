package com.kingchampion36.simple.graphql.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleGraphqlApplication

fun main(args: Array<String>) {
	runApplication<SimpleGraphqlApplication>(*args)
}

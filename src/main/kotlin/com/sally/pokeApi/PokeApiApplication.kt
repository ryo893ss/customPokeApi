package com.sally.pokeApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PokeApiApplication

fun main(args: Array<String>) {
	runApplication<PokeApiApplication>(*args)
}

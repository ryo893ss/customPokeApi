package com.sally.pokeApi.domain.service.seachPokeInfo

import me.sargunvohra.lib.pokekotlin.client.PokeApiClient
import org.springframework.stereotype.Service

@Service
class SearchPoleInfoServiceImpl : SearchPokeInfoService{

    override fun doExec() : String {
        val pokeApi = PokeApiClient()
        val bulbasaur = pokeApi.getPokemonSpecies(1)
        return bulbasaur.name
    }
}

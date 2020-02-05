package com.sally.pokeApi.application.controller.searchPokeInfo

import com.sally.pokeApi.constants.ApiUrlPath
import com.sally.pokeApi.domain.service.seachPokeInfo.SearchPokeInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchPokeInfoController {

    @Autowired
    lateinit var searchPokeInfoService : SearchPokeInfoService

    @GetMapping(ApiUrlPath.SEARCH_POKE_INFO)
    fun getPokeInfo() : String {
        return searchPokeInfoService.doExec()
    }
}

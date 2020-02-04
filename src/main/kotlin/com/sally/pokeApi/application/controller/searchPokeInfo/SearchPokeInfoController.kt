package com.sally.pokeApi.application.controller.searchPokeInfo

import com.sally.pokeApi.domain.service.seachPokeInfo.SearchPokeInfoService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SearchPokeInfoController {

    @Autowired
    lateinit var searchPokeInfoService : SearchPokeInfoService

    @GetMapping("/searchPokeInfo")
    fun getPokeInfo() : String {
        return searchPokeInfoService.doExec()
    }
}

package com.sally.pokeApi.application.resource

sealed class ResponseResult<out T> {
    data class Success<T>(val data : T) :ResponseResult<T>() {
        fun get() : T = data
    }
    data class Failure(val errorResult: ErrorResult) : ResponseResult<Nothing>() {
        fun get() : ErrorResult = errorResult
    }
}

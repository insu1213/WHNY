package com.example.whny

interface RepositoryInterface {
    fun getContent(query : String)
    fun getCountry(query : String)
    fun setContent(query : String)
    fun setCountry(query : String)
}
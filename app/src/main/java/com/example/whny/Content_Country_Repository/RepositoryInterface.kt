package com.example.whny.Content_Country_Repository

interface RepositoryInterface {
    fun getContent()
    fun getCountry()
    fun setContent(context : String)
    fun setCountry(context : String)
    fun loadData()
}
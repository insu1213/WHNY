package com.example.whny

interface RepositoryInterface {
    fun getContent()
    fun getCountry()
    fun setContent(context : String)
    fun setCountry(context : String)
    fun loadData()
}
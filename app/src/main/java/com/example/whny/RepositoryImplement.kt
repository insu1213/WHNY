package com.example.whny

class RepositoryImplement : RepositoryInterface{
    private lateinit var db : RoomDataBase
    private lateinit var content : String
    private lateinit var country : String
    private lateinit var contextList : List<NewYearEntity>

    override fun getContent(query: String) {

    }

    override fun getCountry(query: String) {

    }

    override fun setContent(query: String) {

    }

    override fun setCountry(query: String) {

    }
}
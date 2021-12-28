package com.example.whny.Content_Country_Repository

import com.example.whny.ContentWrite.ContentWriteActivity
import com.example.whny.Content_Country_Room.NewYearEntity
import com.example.whny.Content_Country_Room.RoomDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RepositoryImplement : RepositoryInterface {
    private var db : RoomDataBase = RoomDataBase.getInstance(context)!!
    private val before_content : String = db.Dao().getContent()
    private val before_country : String = db.Dao().getCountry()
    private lateinit var context : ContentWriteActivity

    override fun getContent() {
        db.Dao().getContent()
        loadData()
    }

    override fun getCountry() {
        db.Dao().getCountry()
        loadData()

    }

    override fun setContent(content: String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(content, before_country))
        }
        loadData()
    }

    override fun setCountry(content: String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(before_content, content))
        }
        loadData()
    }

    override fun loadData() {
        //여기다 다른 country, content load 도 해줘야할듯
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().getAll()
            }
        }
    }
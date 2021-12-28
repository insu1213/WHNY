package com.example.whny.Content_Country_Repository

import android.content.Context
import com.example.whny.ContentWrite.ContentWriteActivity
import com.example.whny.Content_Country_Room.NewYearEntity
import com.example.whny.Content_Country_Room.RoomDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RepositoryImplement(private val db : RoomDataBase) : RepositoryInterface {
    private val before_content : String = db.Dao().getContent()
    private val before_country : String = db.Dao().getCountry()

    override fun ReadContent(context: Context) {
        db.Dao().getContent()
        loadData(context)
    }

    override fun ReadCountry(context: Context) {
        db.Dao().getCountry()
        loadData(context)

    }

    override fun createContent(context: Context, content : String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(content, before_country))
        }
        loadData(context)
    }

    override fun SelectCountry(context: Context, content : String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(before_content, content))
        }
        loadData(context)
    }

    override fun loadData(context: Context) {
        //여기다 다른 country, content load 도 해줘야할듯
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().getAll()
            }
        }
    }
package com.example.whny

import android.widget.TextView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class RepositoryImplement : RepositoryInterface{
    private var db : RoomDataBase = RoomDataBase.getInstance(context)!!
    private lateinit var country : String
    private lateinit var contextList : List<NewYearEntity>
    private lateinit var context : ContentWriteActivity

    override fun getContent() {
        db.Dao().getContent()
    }

    override fun getCountry() {
        db.Dao().getCountry()

    }

    override fun setContent(content: String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(content, null))
        }
    }

    override fun setCountry(content: String) {
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().setContent(NewYearEntity(null, content))
        }
    }

    override fun loadData() {
        //여기다 다른 country, content load 도 해줘야할듯
        CoroutineScope(Dispatchers.IO).launch {
            db.Dao().getAll()
            }
        }
    }
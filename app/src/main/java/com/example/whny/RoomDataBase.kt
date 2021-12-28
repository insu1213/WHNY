package com.example.whny

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [NewYearEntity::class], version = 1)
abstract class RoomDataBase : RoomDatabase(){
    //db의 Dao 함수가 DAO를 상속받는다
    abstract fun Dao() : DAO

    companion object{
        private var instance : RoomDataBase? = null

        fun getInstance(context : Context) : RoomDataBase?{
            instance = Room.databaseBuilder(
                context,
                RoomDataBase::class.java,
                "whny-table"
            ).build()

            return instance
        }
    }
}
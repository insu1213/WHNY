package com.example.whny

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query


@Dao
interface DAO {

    @Query("SELECT * FROM NewYearEntity")
    fun getAll() : List<NewYearEntity>

    @Query("SELECT content FROM NewYearEntity")
    fun getContent() : String

    @Query("SELECT country FROM NewYearEntity")
    fun getCountry() : String

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setContent(content : String)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun setCountry(country : String)
}
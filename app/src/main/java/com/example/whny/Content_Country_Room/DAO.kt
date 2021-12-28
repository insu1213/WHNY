package com.example.whny.Content_Country_Room

import androidx.room.*


@Dao
interface DAO {

    @Query("SELECT * FROM NewYearEntity")
    fun getAll() : List<NewYearEntity>

    @Query("SELECT content FROM NewYearEntity")
    fun getContent() : String

    @Query("SELECT country FROM NewYearEntity")
    fun getCountry() : String

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun setContent(content: NewYearEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun setCountry(country : NewYearEntity)
}
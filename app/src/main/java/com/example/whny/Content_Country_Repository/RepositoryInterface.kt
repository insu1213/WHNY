package com.example.whny.Content_Country_Repository

import android.content.Context
import com.example.whny.UseCase.SelectCountry

interface RepositoryInterface {
    fun createContent(context: Context, content : String)
    fun ReadContent(context: Context)
    fun ReadCountry(context: Context)
    fun SelectCountry(context: Context, content : String)
    fun loadData(context: Context)
}
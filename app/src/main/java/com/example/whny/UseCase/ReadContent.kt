package com.example.whny.UseCase

import android.content.Context
import com.example.whny.Content_Country_Repository.RepositoryInterface

class ReadContent(private val repository : RepositoryInterface) {
    fun readContent(context: Context) = repository.ReadContent(context)
}
package com.example.whny.UseCase

import android.content.Context
import com.example.whny.Content_Country_Repository.RepositoryInterface

class ReadCountry(private val repository : RepositoryInterface) {
    fun readCountry(context: Context) = repository.ReadCountry(context)
}
package com.example.whny.UseCase

import android.content.Context
import com.example.whny.Content_Country_Repository.RepositoryInterface

class SelectCountry(private val repository : RepositoryInterface) {
    fun selectCountry(context: Context, content : String) = repository.SelectCountry(context, content)
}
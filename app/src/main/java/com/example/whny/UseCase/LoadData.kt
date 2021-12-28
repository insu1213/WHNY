package com.example.whny.UseCase

import android.content.Context
import com.example.whny.Content_Country_Repository.RepositoryInterface
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class LoadData(private val repository : RepositoryInterface) {
    fun loadData(context: Context) = repository.loadData(context)
}
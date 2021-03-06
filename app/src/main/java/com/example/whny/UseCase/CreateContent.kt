package com.example.whny.UseCase

import android.content.Context
import com.example.whny.Content_Country_Repository.RepositoryInterface
import com.example.whny.Content_Country_Room.RoomDataBase
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CreateContent(private val repository : RepositoryInterface) {
    fun readContent(context: Context, content : String) = repository.createContent(context, content)
}

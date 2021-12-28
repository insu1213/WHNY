package com.example.whny

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.whny.Content_Country_Repository.RepositoryImplement

class ContentWriteActivityViewModel(private val repo : RepositoryImplement) : ViewModel() {

    val value = MutableLiveData<String>()

    fun insert(content:String) {
        repo.setContent(content)
    }

}

class ContentWriteActivityViewModelFactory(private val repo: RepositoryImplement) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(ContentWriteActivityViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return ContentWriteActivityViewModel(repo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}
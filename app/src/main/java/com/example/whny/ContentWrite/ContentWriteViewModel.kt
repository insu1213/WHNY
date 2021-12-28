package com.example.whny

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.whny.Content_Country_Repository.RepositoryImplement
import com.example.whny.UseCase.CreateContent
import com.example.whny.UseCase.ReadContent
import com.example.whny.UseCase.ReadCountry
import com.example.whny.UseCase.SelectCountry

class ContentWriteViewModel(
    private val content : String,
    private val createContent: CreateContent)
    : ViewModel() {

}

class ContentWriteViewModelFactory(private val content : String, private val createContent: CreateContent) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(ContentWriteViewModel::class.java)) {
            ContentWriteViewModel(content, createContent) as T
        } else {
            throw IllegalArgumentException()
        }
    }
}

package com.example.whny

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.whny.UseCase.CreateContent

class MainActivityViewModel(
    val searchData:MutableLiveData<String>
) : ViewModel() {


    fun searchBtnClick() : Boolean {
        if(searchData.value!!.isEmpty()) return false
        return true
    }
}

class MainActivityViewModelFactory(val searchData: MutableLiveData<String>) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return if (modelClass.isAssignableFrom(MainActivityViewModel::class.java)) {
            MainActivityViewModel(searchData) as T
        } else {
            throw IllegalArgumentException()
        }
    }
}
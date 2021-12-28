package com.example.whny

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    val searchData = MutableLiveData<String>()

    fun searchBtnClick() : Boolean {
        if(searchData.value!!.isEmpty()) return false
        return true
    }
}
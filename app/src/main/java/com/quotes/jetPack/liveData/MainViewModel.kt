package com.quotes.jetPack.liveData

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    // --> two types of liveData mutable or unmutable
    private val  factsLiveDataObject = MutableLiveData<String>("This is a fact")

    val factsLiveData : LiveData<String>
    get() = factsLiveDataObject

    fun updateLiveData(){
        factsLiveDataObject.value = "Another Fact"
    }

}
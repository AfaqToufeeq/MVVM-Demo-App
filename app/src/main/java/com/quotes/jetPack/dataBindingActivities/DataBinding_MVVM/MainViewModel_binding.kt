package com.quotes.jetPack.dataBindingActivities.DataBinding_MVVM

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel_binding: ViewModel() {

    val quoteLiveData = MutableLiveData("What you give is what you get")

    fun updateQuote()
    {
        quoteLiveData.value="You'll see it when you believe it"
    }
}
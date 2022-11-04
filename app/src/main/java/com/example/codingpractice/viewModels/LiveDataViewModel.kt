package com.example.codingpractice.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LiveDataViewModel(application: Application) : AndroidViewModel(application) {

    var liveDataObject =  MutableLiveData("This is a Text!!!")

    fun updateTextViaLiveData() {
        liveDataObject.value = "This is Updated Text!!!"
    }
}
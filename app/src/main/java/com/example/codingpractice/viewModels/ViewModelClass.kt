package com.example.codingpractice.viewModels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData

/**
 * 1. This is a ViewModel Class used for LiveData.
 */

class ViewModelClass(application: Application) : AndroidViewModel(application) {

    private var liveDataObject = MutableLiveData("This is a Text!!!")
    fun updateTextViaLiveData() {
        liveDataObject.value = "This is Updated Text!!!"
    }
}
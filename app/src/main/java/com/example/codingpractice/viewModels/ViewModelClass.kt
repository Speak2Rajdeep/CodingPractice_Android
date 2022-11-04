package com.example.codingpractice.viewModels

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel

class ViewModelClass(application: Application) : AndroidViewModel(application) {

    //    var liveDataObject = MutableLiveData("This is a Text!!!")
    var name = ObservableField<String>()

/*
        fun updateTextViaLiveData() {
        liveDataObject.value = "This is Updated Text!!!"
    }
*/

    fun getName() {
        name.set("Raj")
    }
}
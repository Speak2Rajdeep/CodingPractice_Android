package com.example.codingpractice.application

import android.app.Application
import com.example.codingpractice.repository.DemoRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class DemoApplicationClass : Application(){

    override fun onCreate() {
        super.onCreate()

    }

}
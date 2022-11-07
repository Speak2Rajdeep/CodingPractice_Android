package com.example.codingpractice.repository

import android.util.Log
import javax.inject.Inject

class DemoRepository @Inject constructor() {
    fun dependencyInjectionMethod() {
        Log.d("DependencyInjectionTag", "This log is Printed using Dependency Injection.")
    }
}
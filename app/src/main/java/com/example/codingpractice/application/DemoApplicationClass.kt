package com.example.codingpractice.application

import android.app.Application
import com.example.codingpractice.repository.DemoRepository
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

/**
 * 1. This Application class is for Hilt Dependency Injection.
 * 2. @HiltAndroidApp Annotation is used here for Application Class.
 */

@HiltAndroidApp
class DemoApplicationClass : Application()
package com.example.codingpractice.application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/**
 * 1. This Application class is for Hilt Dependency Injection.
 * 2. @HiltAndroidApp Annotation is used here for Application Class.
 */

@HiltAndroidApp
class DemoApplicationClass : Application()
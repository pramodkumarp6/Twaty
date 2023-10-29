package com.example.pramod

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


@HiltAndroidApp
class BaseApplication:Application() {
    override fun onCreate() {
        super.onCreate()
    }
}
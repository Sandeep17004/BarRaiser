package com.example.myapplication

import android.app.Application
import com.example.myapplication.di.koinModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(koinModule)
        }
    }
}
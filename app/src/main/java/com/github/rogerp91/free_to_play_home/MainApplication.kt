package com.github.rogerp91.free_to_play_home

import android.app.Application
import timber.log.Timber

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}
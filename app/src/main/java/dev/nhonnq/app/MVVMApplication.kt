package dev.nhonnq.app

import androidx.multidex.MultiDexApplication
import timber.log.Timber

class MVVMApplication: MultiDexApplication() {
    companion object {
        lateinit var instance: MVVMApplication
            private set
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        Timber.plant(Timber.DebugTree())
    }
}
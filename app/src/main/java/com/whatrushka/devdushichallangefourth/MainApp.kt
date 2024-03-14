package com.whatrushka.devdushichallangefourth

import android.app.Application
import com.whatrushka.devdushichallangefourth.di.commonModule
import com.whatrushka.devdushichallangefourth.di.modules.quotesModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MainApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApp)
            androidLogger(Level.DEBUG)
            modules(
                commonModule,
                quotesModule
            )
        }
    }
}
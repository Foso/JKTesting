package de.jensklingenberg.jktesting

import android.app.Application

import de.jensklingenberg.jktesting.di.AppComponent
import de.jensklingenberg.jktesting.di.AppModule
import de.jensklingenberg.jktesting.di.DaggerAppComponent
import de.jensklingenberg.jktesting.di.RemoteModule

open class App:Application(){

    lateinit var appComponent: AppComponent
    companion object {
        lateinit var instance: App
    }

    open fun initializeDagger() {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(this))
            .remoteModule(RemoteModule())
            .build()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this

        initializeDagger()
    }


}
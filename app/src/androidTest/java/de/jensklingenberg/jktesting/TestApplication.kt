package de.jensklingenberg.jktesting

import android.support.test.InstrumentationRegistry
import de.jensklingenberg.jktesting.di.DaggerAppComponent
import de.jensklingenberg.jktesting.di.RemoteModule
import io.mockk.mockk

class TestApplication : App() {


    val mockcon : ConnectivityService = mockk()

    override fun initializeDagger() {
        appComponent = DaggerAppComponent.builder()
            .appModule( TestAppModule(this,mockcon))
            .remoteModule(RemoteModule())
            .build()
    }



}

val mockApplication = InstrumentationRegistry.getTargetContext().applicationContext as TestApplication

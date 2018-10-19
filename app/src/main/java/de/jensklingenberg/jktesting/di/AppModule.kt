package de.jensklingenberg.jktesting.di

import android.app.Application
import dagger.Module
import dagger.Provides
import de.jensklingenberg.jktesting.ConnectivityService
import de.jensklingenberg.jktesting.IConnectivityService
import javax.inject.Singleton

@Module
open class AppModule(private val application: Application) {

    @Provides
    @Singleton
    fun provideContext(): Application = application


    @Provides
@Singleton
open fun provideCon(): IConnectivityService = ConnectivityService(application.baseContext)

}
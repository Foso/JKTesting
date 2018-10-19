package de.jensklingenberg.jktesting

import android.app.Application
import dagger.Module
import dagger.Provides
import de.jensklingenberg.jktesting.di.AppModule
import io.mockk.every
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.spy
import javax.inject.Singleton

@Module

class TestAppModule(application: Application,val connectivityService: ConnectivityService) : AppModule(application){




    @Provides
    @Singleton
    override fun provideCon(): IConnectivityService {

        return connectivityService
    }

}
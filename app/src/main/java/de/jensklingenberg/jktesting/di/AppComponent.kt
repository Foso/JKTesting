package de.jensklingenberg.jktesting.di

import dagger.Component

import de.jensklingenberg.jktesting.MainActivity
import de.jensklingenberg.jktesting.SecondActivity

import javax.inject.Singleton

@Component(modules = [(AppModule::class), (RemoteModule::class)])
@Singleton
open interface AppComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(secondActivity: SecondActivity)

}

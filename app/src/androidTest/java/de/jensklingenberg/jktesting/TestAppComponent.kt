package de.jensklingenberg.jktesting

import dagger.Component
import de.jensklingenberg.jktesting.di.AppComponent
import de.jensklingenberg.jktesting.di.AppModule
import de.jensklingenberg.jktesting.di.RemoteModule


open interface TestAppComponent : AppComponent{
    fun inject(secondActivityTest: de.jensklingenberg.jktesting.SecondActivityTest)



}
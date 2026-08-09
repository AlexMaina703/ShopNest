package com.example.shopnest

import android.app.Application
import com.example.data.di.dataModule
import com.example.domain.di.domainModule
import com.example.shopnest.di.presentationModule
import org.koin.core.context.GlobalContext.startKoin

class ShopNestApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {

            modules(
                listOf(
                    presentationModule,
                    domainModule,
                    dataModule
                ))
        }
    }
}
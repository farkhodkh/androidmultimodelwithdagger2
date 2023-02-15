package com.example.multymodelarch_reply

import android.app.Application
import android.content.Context
import com.example.multymodelarch_reply.di.AppComponent
import com.example.multymodelarch_reply.di.AppComponentDependencies
import com.example.multymodelarch_reply.di.DaggerAppComponent

class MultiModelArchApplication: Application() {

    companion object {
        lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        MultiModelArchApplication.appComponent = DaggerAppComponent
            .builder()
            .application(this)
            .appComponentDependencies(AppComponentDependenciesImpl())
            .build()

    }

    private inner class AppComponentDependenciesImpl: AppComponentDependencies {
        override val context: Context = this@MultiModelArchApplication
    }
}


val Context.appComponent: AppComponent
get() = when(this) {
    is MainActivity -> {
        MultiModelArchApplication.appComponent
    }
    else -> {
        this.applicationContext.appComponent
    }
}
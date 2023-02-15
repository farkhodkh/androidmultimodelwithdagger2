package com.example.multymodelarch_reply.di

import android.app.Application
import android.content.Context
import com.example.core.features.AppScope
import com.example.multymodelarch_reply.MainActivity
import com.example.testingmodule.ui.di.TestFragmentComponent
import dagger.BindsInstance
import dagger.Component

@Component(
    modules = [AppModule::class, GlobalNavigationModule::class],
    dependencies = [AppComponentDependencies::class]
)
@AppScope
interface AppComponent: TestFragmentComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun appComponentDependencies(dependencies: AppComponentDependencies): Builder

        fun build(): AppComponent
    }

    fun inject(application: MainActivity)
}

interface AppComponentDependencies {
    val context: Context
}
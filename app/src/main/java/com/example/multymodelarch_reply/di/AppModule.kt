package com.example.multymodelarch_reply.di

import android.app.Application
import android.content.Context
import com.example.core.features.AppScope
import com.example.core.features.TestFragmentScope
import com.example.multymodelarch_reply.SomeClass
import com.example.testingmodule.ui.fragments.TestFragment
import dagger.Module
import dagger.Provides

@Module
object AppModule {
    @AppScope
    @Provides
    fun provideContext(context: Context): Context = context

    @AppScope
    @Provides
    fun providesSomeClass(context: Application): SomeClass = SomeClass(context)

//    @TestFragmentScope
//    @Provides
//    fun providesTestFragment(): TestFragment = TestFragment()
}

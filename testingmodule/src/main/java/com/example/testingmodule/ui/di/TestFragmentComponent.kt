package com.example.testingmodule.ui.di

import com.example.core.features.TestFragmentScope
import com.example.testingmodule.ui.fragments.TestFragment
import dagger.Component

@TestFragmentScope
@Component(dependencies = [TestFragmentComponentDependencies::class])
interface TestFragmentComponent {

    fun inject(fragment: TestFragment)

    @Component.Builder
    interface Builder {

        fun deps(deps: TestFragmentComponentDependencies): Builder

        fun build(): TestFragmentComponent
    }
}

interface TestFragmentComponentDependencies {

}
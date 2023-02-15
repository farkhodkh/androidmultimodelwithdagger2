package com.example.multymodelarch_reply

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentTransaction
import com.example.multymodelarch_reply.databinding.ActivityMainBinding
import com.example.testingmodule.ui.fragments.TestFragment
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var someClass: SomeClass

    @Inject
    lateinit var fragment: TestFragment

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        appComponent.inject(this)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenFragment.setOnClickListener {

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragmentContainer, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .addToBackStack("HomeFragment")
                .commit()
        }



        someClass.print("Some class text")
    }
}
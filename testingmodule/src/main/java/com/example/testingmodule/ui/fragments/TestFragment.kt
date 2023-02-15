package com.example.testingmodule.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.testingmodule.databinding.FragmentTestBinding
import com.example.testingmodule.ui.viewmodel.TestFragmentViewModel
import javax.inject.Inject

class TestFragment @Inject constructor() : Fragment() {

    lateinit var binding: FragmentTestBinding

    private lateinit var viewModel: TestFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentTestBinding.inflate(inflater)

        viewModel = ViewModelProvider(this)[TestFragmentViewModel::class.java]

        binding.fragmentText.text = viewModel.getSomeString()

        return binding.root
    }
}
package com.example.codingpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.R
import com.example.codingpractice.repository.DemoRepository
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * 1. This Fragment is used to implement Dependency Injection.
 * 2. @AndroidEntryPoint annotation is used for Fragment and Activity.
 * 3. A simple Repository is used for a Log.
 */

@AndroidEntryPoint
class DependencyInjectionFragment : Fragment() {

    @Inject
    lateinit var demoRepository: DemoRepository

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_dependency_injection, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        demoRepository.dependencyInjectionMethod()
    }
}
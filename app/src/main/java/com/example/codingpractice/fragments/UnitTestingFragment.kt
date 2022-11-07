package com.example.codingpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.codingpractice.R
import com.example.codingpractice.databinding.FragmentUnitTestingBinding

/**
 * 1. This Fragments is for Unit Testing.
 * 2. Fields have been tested for Input.
 */

class UnitTestingFragment : Fragment() {

    private lateinit var binding: FragmentUnitTestingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_unit_testing, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding

    }
}
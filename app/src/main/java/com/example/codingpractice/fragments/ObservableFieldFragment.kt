package com.example.codingpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ObservableField
import androidx.fragment.app.Fragment
import com.example.codingpractice.R
import com.example.codingpractice.databinding.FragmentObservableFieldBinding

/**
 * 1. Create a ObservableField with Initial Value
 * 2. Observe the Field and update the UI Accordingly.
 */

class ObservableFieldFragment : Fragment() {
    private lateinit var binding: FragmentObservableFieldBinding
    val observableField = ObservableField<Int>(0)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding =
            DataBindingUtil.inflate(inflater, R.layout.fragment_observable_field, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.fragmentVariable = this
        binding.lifecycleOwner = this@ObservableFieldFragment
    }

    fun changeText() {
        observableField.set(observableField.get()!!.plus(1))
        Toast.makeText(
            this@ObservableFieldFragment.context,
            "Age increased to ${observableField.get()} using ObservableField!",
            Toast.LENGTH_SHORT
        ).show();
    }
}
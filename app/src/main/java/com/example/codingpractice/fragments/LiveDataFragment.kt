package com.example.codingpractice.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.codingpractice.R
import com.example.codingpractice.databinding.FragmentLiveDataBinding
import com.example.codingpractice.viewModels.LiveDataViewModel

class LiveDataFragment : Fragment() {
    private lateinit var liveDataViewModel: LiveDataViewModel
    private lateinit var binding: FragmentLiveDataBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_live_data, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Connecting to ViewModel Class
        liveDataViewModel = ViewModelProvider(this@LiveDataFragment)[LiveDataViewModel::class.java]


        binding.viewModels = liveDataViewModel
        binding.lifecycleOwner = this@LiveDataFragment

    }
}
package com.example.codingpractice.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.R

class SealedClassFragment : Fragment() {

    sealed class SealedClassExample {
        data class DataClass1(val tempVariable: Int)
        data class DataClass2(val tempVariable: Int, val tempVariable2: String)

        object Test1 {
            fun display() {
                Log.d(
                    "Output",
                    "Called From Inner object of Sealed Class"
                )
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sealed_class, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val obj = SealedClassExample.Test1
        obj.display()
        val obj1 = SealedClassExample.DataClass1(1)
        Log.d("Output", obj1.toString())
    }
}
package com.example.codingpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.codingpractice.fragments.LiveDataFragment

/**
 * 1. This is an Activity which contains different Fragments.
 * 2. Calling Individual Fragment results individual Function
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addFragment(LiveDataFragment())
        /**
        addFragment(ChannelFragment())
        addFragment(DependencyInjectionFragment())
        addFragment(FlowsFragment())
        addFragment(ObservableFieldFragment())
        addFragment(SealedClassFragment())
         */
    }

    private fun addFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.framelayout, fragment)
        fragmentTransaction.commit()
    }
}
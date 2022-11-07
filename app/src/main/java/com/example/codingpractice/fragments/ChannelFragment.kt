package com.example.codingpractice.fragments

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.codingpractice.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

/**
 * 1. This Fragment is used for Channel Data Pass.
 * 2. We have a Producer and a Consumer Here.
 * 3. Producer Send the data through Channel.
 * 4. Consumer receives the data from the Channel.
 */

class ChannelFragment : Fragment() {

    private val channel = Channel<Int>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_channel, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        producer()
        consumer()
    }

    private fun producer() {
        CoroutineScope(Dispatchers.IO).launch {
            channel.send(1)
            channel.send(2)
            channel.send(3)
        }
    }

    //Consumer Consumes Data
    private fun consumer() {
        CoroutineScope(Dispatchers.IO).launch {
            Log.d("ChannelsLog", channel.receive().toString())
            delay(3000)
            Log.d("ChannelsLog", channel.receive().toString())
            delay(3000)
            Log.d("ChannelsLog", channel.receive().toString())
        }
    }
}
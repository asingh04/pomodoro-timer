package com.example.pomodorotimer

import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import com.example.pomodorotimer.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mTextView = TextView(findViewById(R.id.mainTextView))
        mTextView.setText(  "Hello World")

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
package com.quotes.jetPack.liveData

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.quotes.jetPack.R

class liveDataActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    private val factsTextView: TextView
    get() = findViewById(R.id.factsTextView)

    private val btnUpdate: Button
        get() = findViewById(R.id.btnUpdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.factsLiveData.observe(this, Observer{

            //to track the update and made change accordingly

            factsTextView.text = it
        })

        btnUpdate.setOnClickListener{
            mainViewModel.updateLiveData()
        }

    }
}
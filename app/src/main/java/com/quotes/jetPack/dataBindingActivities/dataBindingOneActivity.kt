package com.quotes.jetPack.dataBindingActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.quotes.jetPack.R
import com.quotes.jetPack.databinding.ActivityDataBindingOneBinding

class dataBindingOneActivity : AppCompatActivity() {

    lateinit var binding: ActivityDataBindingOneBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_data_binding_one)


//        binding.textView1.text = "Afaq Toufeeq, Android Developer"
//        binding.button1.setOnClickListener {
//            binding.textView1.text = "Jerry Axe, PUBG Player"
//        }

        //declaratively Bind the Data with the view

        val infoObj = InfoClass("Afaq Toufeeq")
        binding.nameInfo = infoObj

        binding.buttonName.setOnClickListener {
            binding.nameInfo=InfoClass("Jerry Axe")
        }

    }
}
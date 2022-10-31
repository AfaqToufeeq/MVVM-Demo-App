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

<<<<<<< HEAD
        val infoObj = InfoClass("Afaq Toufeeq")
        binding.nameInfo = infoObj
=======
//        val infoObj = infoClass("Afaq Toufeeq")
//        binding.nameInfo = infoObj
>>>>>>> 74bce5fca9f2613e80cc2ac3ac6f5f0fd7f9c71e

        binding.buttonName.setOnClickListener {
            binding.nameInfo=InfoClass("Jerry Axe")
        }

    }
}
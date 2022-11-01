package com.quotes.jetPack.bindingAdapter_customDataBinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.quotes.jetPack.R
import com.quotes.jetPack.databinding.ActivityCustomDataBindingBinding

class customDataBindingActivity : AppCompatActivity() {
    lateinit var binding : ActivityCustomDataBindingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_data_binding)


        val post = Post("Android Development",
        "Development Department",
        "https://unsplash.com/photos/b9-odQi5oDo")

        binding.post = post

    }
}
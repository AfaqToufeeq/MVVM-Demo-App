package com.quotes.jetPack.dataBindingActivities.dataBinding_MVVM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.quotes.jetPack.R
import com.quotes.jetPack.databinding.ActivityDataBindingMvvmBinding

class dataBindingActivity_MVVM : AppCompatActivity() {

    lateinit var binding: ActivityDataBindingMvvmBinding
    lateinit var mainViewModel: MainViewModel_binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding_mvvm)
        mainViewModel = ViewModelProvider(this).get(MainViewModel_binding::class.java)

//        mainViewModel.quoteLiveData.observe(this, Observer {
//            binding.textView1.text = it
//        })

        binding.mainViewModel2 = mainViewModel
        binding.lifecycleOwner=this          //life cycle observer


//        binding.buttonName1.setOnClickListener {
//            mainViewModel.updateQuote()
//        }
    }
}
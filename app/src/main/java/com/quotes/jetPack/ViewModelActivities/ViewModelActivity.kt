package com.quotes.jetPack.ViewModelActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.quotes.jetPack.R

class ViewModelActivity : AppCompatActivity() {

    lateinit var textCount : TextView

    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_model)

        mainViewModel= ViewModelProvider(this,MainViewModelFactory(10)).get(MainViewModel::class.java)
        textCount=findViewById(R.id.textView)

        setText()

    }
    fun setText() {

        textCount.text= mainViewModel.count.toString()
    }

    fun increment(v:View)
    {
        mainViewModel.increment()
        setText()
    }


}
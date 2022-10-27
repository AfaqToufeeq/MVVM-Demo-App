package com.quotes.jetPack.QuotesApp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.quotes.jetPack.R

class QuotesActivity : AppCompatActivity() {

    lateinit var mainViewModel: MainViewModel

    private val quoteText : TextView
    get() = findViewById(R.id.quoteText)

    private val quoteAurthor : TextView
    get() =  findViewById(R.id.quoteAuthor)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quotes)
        mainViewModel = ViewModelProvider(this, MainViewModelFactory(application)).get(MainViewModel::class.java)

        setQuote(mainViewModel.getQuote())

    }

    fun setQuote(quote: Quote)
    {
        quoteText.text = quote.text
        quoteAurthor.text = quote.author
    }

    fun onPrevious(view: View) {

        setQuote(mainViewModel.previousQuote())
    }
    fun onNext(view: View) {
        setQuote(mainViewModel.nextQuote())
    }
    fun onShare(view: View) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.setType("text/plain")
        intent.putExtra(Intent.EXTRA_TEXT,mainViewModel.getQuote().text)
        startActivity(intent)
    }
}
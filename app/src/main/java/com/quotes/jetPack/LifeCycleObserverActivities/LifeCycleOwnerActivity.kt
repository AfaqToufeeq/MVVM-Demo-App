package com.quotes.jetPack.LifeCycleObserverActivities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.quotes.jetPack.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle_owner)

        lifecycle.addObserver(Observer())
        Log.d("MAIN", "ACTIVITY - ON CREATE")
    }

    override fun onStart() {
        super.onStart()

        Log.d("MAIN", "ACTIVITY - ON STArt")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MAIN", "ACTIVITY - ON RESUME")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MAIN", "ACTIVITY - ON PAUSE")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MAIN", "ACTIVITY - ON STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MAIN", "ACTIVITY - ON Destroy")
    }
}
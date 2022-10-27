package app.practice.androidarchitectureandjetpack.ViewModelActivities

import androidx.lifecycle.ViewModel

class MainViewModel(val initialValue:Int) : ViewModel() {

    var count:Int= initialValue

    fun increment() {
        count++
    }

}
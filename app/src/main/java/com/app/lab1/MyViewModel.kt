package com.app.lab1


import androidx.lifecycle.ViewModel

class MyViewModel(myString: String) : ViewModel() {

    private var _myString = myString
    val str: String
        get() = _myString

    fun changeString(s: String) {
        _myString = s
    }
}
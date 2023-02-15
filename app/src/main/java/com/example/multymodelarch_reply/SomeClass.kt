package com.example.multymodelarch_reply

import android.content.Context
import android.util.Log

class SomeClass (val context: Context) {
    fun print(testText: String) {
        Log.d("SomeClass", "print: $testText")
    }
}
package com.example.myhome_l7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun setContentView(activityMain: Int) {

    }
}

open class AppCompatActivity {
    fun onCreate(savedInstanceState: Bundle?) {
        TODO("Not yet implemented")
    }

}

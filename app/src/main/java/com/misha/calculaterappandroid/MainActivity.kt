package com.misha.calculaterappandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addclick(view: View) {
        intent= Intent(this,AdditionActivity::class.java);
        startActivity(intent);
    }

    fun subclick(view: View) {
        intent= Intent(this,SuntractionActivity::class.java);
        startActivity(intent);
    }

    fun mulclick(view: View) {
        intent= Intent(this,MultiplicationActivity::class.java);
        startActivity(intent);
    }

    fun divclick(view: View) {
        intent= Intent(this,DivisionActivity::class.java);
        startActivity(intent);
    }
}
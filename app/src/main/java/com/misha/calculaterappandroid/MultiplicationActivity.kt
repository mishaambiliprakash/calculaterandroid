package com.misha.calculaterappandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MultiplicationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication)
    }

    fun mulbutton(view: View) {
        var getnum1=findViewById<EditText>(R.id.nu1);
        var getnum2=findViewById<EditText>(R.id.nu2);
        var nu1=getnum1.text.toString();
        var nu2=getnum2.text.toString();
        var result :Double=nu1.toDouble() * nu2.toDouble();
        Toast.makeText(this,result.toString(), Toast.LENGTH_LONG).show();
    }

    fun backbutton(view: View) {
        intent= Intent(this,MainActivity::class.java);
        startActivity(intent);
    }
}
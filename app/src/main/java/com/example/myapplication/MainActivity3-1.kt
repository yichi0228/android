package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class `MainActivity3-1`: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_1)
        var result=findViewById<TextView>(R.id.textView15)
        val bmi=intent.getFloatExtra("BMI_EXTRA",0f)
        result.setText(bmi.toString())
    }
}
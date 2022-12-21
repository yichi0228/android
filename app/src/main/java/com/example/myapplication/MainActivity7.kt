package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity7:AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        var tv_bmr=findViewById<TextView>(R.id.tv_BMR)
        val height=intent.getFloatExtra("Height",0f)
        val weight=intent.getFloatExtra("Weight",0f)
        val age=intent.getFloatExtra("Age",0f)
        val bmr=intent.getFloatExtra("BMR_EXTRA",0f)
        tv_bmr.setText("年齡:"+age.toString()+"\n身高:"+height.toString()+"\n體重:"+weight.toString()+"\nBMR:"+bmr.toString())
    }
}
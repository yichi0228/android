package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class `MainActivity3-1`: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3_1)
        var result=findViewById<TextView>(R.id.textView14)
        var suggest=findViewById<TextView>(R.id.suggest)

        val height=intent.getFloatExtra("Height",0f)
        val weight=intent.getFloatExtra("Weight",0f)
        val bmi=intent.getFloatExtra("BMI_EXTRA",0f)
        result.setText("身高為:"+height.toString()+"\n體重為:"+weight.toString()+"\nBMI為:"+bmi.toString())
        if (bmi<18.5){
            suggest.text="體重過輕"
        }else if (bmi>=18.5&& bmi<24.9){
            suggest.text="體重適中"
        }else if (bmi >= 30){
            suggest.text="體重過重"
        }
    }
}
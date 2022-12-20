package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val btn_bmi=findViewById<Button>(R.id.button2)

    }
    fun  bmi(view:View){
        val ed_height=findViewById<EditText>(R.id.editTextTextPersonName)
        val ed_weight=findViewById<EditText>(R.id.editTextTextPersonName2)
        val weight=ed_weight.text.toString().toFloat()
        val height=ed_height.text.toString().toFloat()
        val bmi=weight/(height*height)
        Log.d("BMI",bmi.toString()+weight.toString()+height.toString())
        Intent(this,MainActivity3_1::class.java).apply {
            putExtra("BMI_EXTRA",bmi)
            putExtra("Weight",weight)
            putExtra("Height",height)
            startActivity(this)
        }
    }

}
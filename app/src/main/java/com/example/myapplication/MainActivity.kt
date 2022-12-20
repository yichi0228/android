package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.FrameLayout
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bn_food =findViewById<Button>(R.id.bn_food)
        val bn_pressure = findViewById<Button>(R.id.bn_pressure)
        val bn_BMI = findViewById<Button>(R.id.bn_BMI)
        val frameLayout =findViewById<FrameLayout>(R.id.frameLayout)
        val frameLayout2 =findViewById<FrameLayout>(R.id.frameLayout2)
        val frameLayout3 =findViewById<FrameLayout>(R.id.frameLayout3)
        val frameLayout4 =findViewById<FrameLayout>(R.id.frameLayout4)

        bn_BMI.setOnClickListener{
            startActivity(Intent(this,MainActivity3::class.java))
        }

        bn_pressure.setOnClickListener{
            startActivity(Intent(this,MainActivity4::class.java))
        }
    }
}


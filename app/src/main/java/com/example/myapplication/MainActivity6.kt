package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

    }
    fun  bmr(view: View){
        val ed_weight=findViewById<EditText>(R.id.ed_weight)
        val ed_height=findViewById<EditText>(R.id.ed_height)
        val ed_age=findViewById<EditText>(R.id.ed_age)
        val rb_boy=findViewById<RadioButton>(R.id.rbtn_male)
        val rb_girl=findViewById<RadioButton>(R.id.rbtn_female)
        val weight=ed_weight.text.toString().toFloat()
        val height=ed_height.text.toString().toFloat()
        val age=ed_age.text.toString().toFloat()
        val number=10
        val number2=6
        val number3=5
        val number4=161
        var bmr=
            if (rb_boy.isChecked){
                (number*weight)+(number2*height)-(number3*age)+number3
            }else{
                (number*weight)+(number2*height)-(number3*age)-number4
            }
        Log.d("BMR",bmr.toString()+weight.toString()+height.toString()+age.toString())
        Intent(this,MainActivity7::class.java).apply {
            putExtra("BMR_EXTRA",bmr)
            putExtra("Weight",weight)
            putExtra("Height",height)
            putExtra("Age",age)
            startActivity(this)
        }
    }

}
package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //指定這個Activity所要使用的Xml畫面，透過R類別指定activity_main.xml

        val rbtn1_yes = findViewById<RadioButton>(R.id.rbtn1_yes)
        val rbtn1_no = findViewById<RadioButton>(R.id.rbtn1_no)

        val rbtn2_yes = findViewById<RadioButton>(R.id.rbtn2_yes)
        val rbtn2_no = findViewById<RadioButton>(R.id.rbtn2_no)

        val rbtn3_yes = findViewById<RadioButton>(R.id.rbtn3_yes)
        val rbtn3_no = findViewById<RadioButton>(R.id.rbtn3_no)

        val rbtn4_yes = findViewById<RadioButton>(R.id.rbtn4_yes)
        val rbtn4_no = findViewById<RadioButton>(R.id.rbtn4_no)

        val rbtn5_yes = findViewById<RadioButton>(R.id.rbtn5_yes)
        val rbtn5_no = findViewById<RadioButton>(R.id.rbtn5_no)

        val rbtn6_yes = findViewById<RadioButton>(R.id.rbtn6_yes)
        val rbtn6_no = findViewById<RadioButton>(R.id.rbtn6_no)

        val rbtn7_yes = findViewById<RadioButton>(R.id.rbtn7_yes)
        val rbtn7_no = findViewById<RadioButton>(R.id.rbtn7_no)

        val rbtn8_yes = findViewById<RadioButton>(R.id.rbtn8_yes)
        val rbtn8_no = findViewById<RadioButton>(R.id.rbtn8_no)

        val rbtn9_yes = findViewById<RadioButton>(R.id.rbtn9_yes)
        val rbtn9_no = findViewById<RadioButton>(R.id.rbtn9_no)

        val rbtn10_yes = findViewById<RadioButton>(R.id.rbtn10_yes)
        val rbtn10_no = findViewById<RadioButton>(R.id.rbtn10_no)

        val rbtn11_yes = findViewById<RadioButton>(R.id.rbtn11_yes)
        val rbtn11_no = findViewById<RadioButton>(R.id.rbtn11_no)

        val rbtn12_yes = findViewById<RadioButton>(R.id.rbtn12_yes)
        val rbtn12_no = findViewById<RadioButton>(R.id.rbtn12_no)

        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1)
        val radioGroup2 = findViewById<RadioGroup>(R.id.radioGroup2)
        val radioGroup3 = findViewById<RadioGroup>(R.id.radioGroup3)
        val radioGroup4 = findViewById<RadioGroup>(R.id.radioGroup4)
        val radioGroup5 = findViewById<RadioGroup>(R.id.radioGroup5)
        val radioGroup6 = findViewById<RadioGroup>(R.id.radioGroup6)
        val radioGroup7 = findViewById<RadioGroup>(R.id.radioGroup7)
        val radioGroup8 = findViewById<RadioGroup>(R.id.radioGroup8)
        val radioGroup9 = findViewById<RadioGroup>(R.id.radioGroup9)
        val radioGroup10 = findViewById<RadioGroup>(R.id.radioGroup10)
        val radioGroup11 = findViewById<RadioGroup>(R.id.radioGroup11)
        val radioGroup12 = findViewById<RadioGroup>(R.id.radioGroup12)


        val btn_submit = findViewById<Button>(R.id.btn_submit)


        btn_submit.setOnClickListener {
            if (   (rbtn1_yes.isChecked || rbtn1_no.isChecked)
                && (rbtn2_yes.isChecked || rbtn2_no.isChecked)
                && (rbtn3_yes.isChecked || rbtn3_no.isChecked)
                && (rbtn4_yes.isChecked || rbtn4_no.isChecked)
                && (rbtn5_yes.isChecked || rbtn5_no.isChecked)
                && (rbtn6_yes.isChecked || rbtn6_no.isChecked)
                && (rbtn7_yes.isChecked || rbtn7_no.isChecked)
                && (rbtn8_yes.isChecked || rbtn8_no.isChecked)
                && (rbtn9_yes.isChecked || rbtn9_no.isChecked)
                && (rbtn10_yes.isChecked || rbtn10_no.isChecked)
                && (rbtn11_yes.isChecked || rbtn11_no.isChecked)
                && (rbtn12_yes.isChecked || rbtn12_no.isChecked)

            ) {
                var num = 0
                if (rbtn1_yes.isChecked) num += 1
                if (rbtn2_yes.isChecked) num += 1
                if (rbtn3_yes.isChecked) num += 1
                if (rbtn4_yes.isChecked) num += 1
                if (rbtn5_yes.isChecked) num += 1
                if (rbtn6_yes.isChecked) num += 1
                if (rbtn7_yes.isChecked) num += 1
                if (rbtn8_yes.isChecked) num += 1
                if (rbtn9_yes.isChecked) num += 1
                if (rbtn10_yes.isChecked) num += 1
                if (rbtn11_yes.isChecked) num += 1
                if (rbtn12_yes.isChecked) num += 1


                var intent = Intent(this, MainActivity2::class.java)
                intent.putExtra("num", num.toString())
                startActivity(intent)
            }

            else {
                Toast.makeText(this, "確認每題是否皆有做勾選", Toast.LENGTH_SHORT).show()

            }
            }
        }
    }


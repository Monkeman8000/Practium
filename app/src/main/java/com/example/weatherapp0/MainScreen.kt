package com.example.weatherapp0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainScreen : AppCompatActivity() {
    val days = arrayOf("Monday","Tuesday","wednesday","Thursday","Friday","Saturday","Sunday")
    var mintemp = arrayOf(12,15,10,8,10,10,10)
    var maxtemp = arrayOf(25,29,20,22,19,18,16)
    val weatherConditions = arrayOf("Sunny","Sunny","Cloudy","Rainy","Light Rain","Heavy Rain","Cold")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val averageInput = findViewById<EditText>(R.id.Viewpage)
        val backbtn = findViewById<Button>(R.id.backbtn)
        backbtn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val calculatbtn = findViewById<Button>(R.id.calbtn)
        calculatbtn.setOnClickListener {
            val avgMinTemp = mintemp.average()
            val avgMaxTemp = maxtemp.average()
            val avgTemp = (avgMinTemp + avgMaxTemp) / 2


        }



    }
}






package com.example.weatherapp0

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView

class DetailScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_screen)
        val temperatures =
            intent.getDoubleArrayExtra("TEMPERATURE")?.map { it.toString() }?.toTypedArray()

        if (temperatures != null) {
            val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, temperatures)
            findViewById<ListView>(R.id.listView).adapter = adapter
        }

        findViewById<Button>(R.id.backButton).setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
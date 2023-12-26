package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val display = findViewById(R.id.TV_name) as TextView
        val BT1 = findViewById(R.id.BT1) as Button
        val BT2 = findViewById(R.id.BT2) as Button
        val BT3 = findViewById(R.id.BT3) as Button
        val BT4 = findViewById(R.id.BT4) as Button
        val BT5 = findViewById(R.id.BT5) as Button
        val BT6 = findViewById(R.id.BT6) as Button
        val BT7 = findViewById(R.id.BT7) as Button
        val BT8 = findViewById(R.id.BT8) as Button
        val BT9 = findViewById(R.id.BT9) as Button
        val BT0 = findViewById(R.id.BT0) as Button
        val BTV1 = findViewById(R.id.BTV1) as Button
        val BTV2 = findViewById(R.id.BTV2) as Button
        val BTV3 = findViewById(R.id.BTV3) as Button
        val BTV4 = findViewById(R.id.BTV4) as Button
        val BTV5 = findViewById(R.id.BTV5) as Button

        BT1.setOnClickListener{
            display.setText("1")
        }
        BT2.setOnClickListener{
            display.setText("2")
        }
        BT3.setOnClickListener{
            display.setText("3")
        }
        BT4.setOnClickListener{
            display.setText("4")
        }
        BT5.setOnClickListener{
            display.setText("5")
        }
        BT6.setOnClickListener{
            display.setText("6")
        }
        BT7.setOnClickListener{
            display.setText("7")
        }
        BT8.setOnClickListener{
            display.setText("8")
        }
        BT9.setOnClickListener{
            display.setText("9")
        }
        BT0.setOnClickListener{
            display.setText("0")
        }
        BTV1.setOnClickListener{
            display.setText("+")
        }
        BTV2.setOnClickListener{
            display.setText("-")
        }
        BTV3.setOnClickListener{
            display.setText("*")
        }
        BTV4.setOnClickListener{
            display.setText("/")
        }
        BTV5.setOnClickListener{
            display.setText("=")
        }
    }
}
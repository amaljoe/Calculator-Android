package com.dscmbcet.dsccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<TextView>(R.id.num1)
        val num2 = findViewById<TextView>(R.id.num2)
        val result = findViewById<TextView>(R.id.result)
        val equalsButton = findViewById<Button>(R.id.equals_button)
        equalsButton.setOnClickListener {
            val n1 = num1.text.toString().toIntOrNull()
            val n2 = num2.text.toString().toIntOrNull()
            if (n1 != null && n2 != null) {
                result.text = n1.plus(n2).toString()
            }
        }
    }
}
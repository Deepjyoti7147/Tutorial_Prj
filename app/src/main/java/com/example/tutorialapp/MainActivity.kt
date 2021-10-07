package com.example.tutorialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    private var quantity: Int = 0
    private var price: Int = 0
    private fun updateValue() {
        findViewById<TextView>(R.id.qtr).text = quantity.toString()
        findViewById<TextView>(R.id.prc).text = price.toString()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.add).setOnClickListener {
            quantity++
            price += 3
            updateValue()
        }

        findViewById<Button>(R.id.sub).setOnClickListener {
            if(quantity<=0) {
                quantity--
                updateValue()
            }

            if(price>0) {
                price -=3
                updateValue()
            }

        }

    }

}


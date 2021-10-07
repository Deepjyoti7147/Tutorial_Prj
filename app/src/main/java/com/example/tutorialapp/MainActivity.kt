package com.example.tutorialapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


<<<<<<< Updated upstream
    private var quantity: Int = 0
    private var price: Int = 0
    private fun updateValue() {
        findViewById<TextView>(R.id.qtr).text = quantity.toString()
        findViewById<TextView>(R.id.prc).text = price.toString()
=======
    var quantity: Int = 0
    var price: Int = 0
    private fun updateValue() {
        findViewById<TextView>(R.id.qtr).text = quantity.toString()
        findViewById<TextView>(R.id.pricevalue).text = price.toString()
>>>>>>> Stashed changes
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

<<<<<<< Updated upstream
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

=======



        findViewById<Button>(R.id.add).setOnClickListener{

                quantity++
                price += 3
                updateValue()

        }


        findViewById<Button>(R.id.sub).setOnClickListener {
            if (quantity == 0)
            {
                quantity = 0
            }
            else
            {
                quantity--
                price -= 3
                updateValue()
            }
>>>>>>> Stashed changes
        }

    }

}


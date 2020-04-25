package com.example.calc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nStr : String = ""
        val nList = ArrayList<Double>() // arraylist to store numbers
        val oList = ArrayList<Char>() // arraylist to store operations

        var formula = findViewById<TextView>(R.id.formula)
        var num0 = findViewById<Button>(R.id.num0)
        var num1 = findViewById<Button>(R.id.num1)
        var num2 = findViewById<Button>(R.id.num2)
        var num3 = findViewById<Button>(R.id.num3)
        var num4 = findViewById<Button>(R.id.num4)
        var num5 = findViewById<Button>(R.id.num5)
        var num6 = findViewById<Button>(R.id.num6)
        var num7 = findViewById<Button>(R.id.num7)
        var num8 = findViewById<Button>(R.id.num8)
        var num9 = findViewById<Button>(R.id.num9)
        var clear = findViewById<Button>(R.id.clear)
        var sign = findViewById<Button>(R.id.sign)
        var percent = findViewById<Button>(R.id.percent)
        var del  = findViewById<Button>(R.id.delete)
        var slash = findViewById<Button>(R.id.slash)
        var times = findViewById<Button>(R.id.times)
        var minus = findViewById<Button>(R.id.minus)
        var point = findViewById<Button>(R.id.point)
        var equal = findViewById<Button>(R.id.equal)
        var plus = findViewById<Button>(R.id.plus)


        num0.setOnClickListener {
            formula.text = "${formula.text}0"
            nStr += "0"
        }
        num1.setOnClickListener {
            formula.text = "${formula.text}1"
            nStr += "1"
        }
        num2.setOnClickListener {
            formula.text = "${formula.text}2"
            nStr += "2"
        }
        num3.setOnClickListener {
            formula.text = "${formula.text}3"
            nStr += "3"
        }
        num4.setOnClickListener {
            formula.text = "${formula.text}4"
            nStr += "4"
        }
        num5.setOnClickListener {
            formula.text = "${formula.text}5"
            nStr += "5"
        }
        num6.setOnClickListener {
            formula.text = "${formula.text}6"
            nStr += "6"
        }
        num7.setOnClickListener {
            formula.text = "${formula.text}7"
            nStr += "7"
        }
        num8.setOnClickListener {
            formula.text = "${formula.text}8"
            nStr += "8"
        }
        num9.setOnClickListener {
            formula.text = "${formula.text}9"
            nStr += "9"
        }
        point.setOnClickListener {
            formula.text = "${formula.text}."
            nStr += "."
        }

    }

}


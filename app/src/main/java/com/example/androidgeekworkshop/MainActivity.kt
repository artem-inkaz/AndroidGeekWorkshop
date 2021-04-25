package com.example.androidgeekworkshop

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.androidgeekworkshop.lesson1.FirstClass
import com.example.androidgeekworkshop.lesson1.FirstClassCopy
import com.example.androidgeekworkshop.lesson1.SomeRepository
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = FirstClass("Artem", "Ternovenko")
        val data2 = data.copy()
        Toast.makeText(this, "Name: ${data.name}, ${data.secondName}", Toast.LENGTH_SHORT).show()

        button1.setOnClickListener {
            textView2.text = "Name: ${data.name}, ${data.secondName}"
        }

        button2.setOnClickListener {
            textView2.visibility = View.GONE
//            textView.text = data2.toString()
//            textView.text = SomeRepository.data.copy().toString()
            textView.text = SomeRepository.dataClassCopy()
        }

        buttonFor.setOnClickListener {
            var k = 0
            for (i in 1..10) {
                Log.d("Hello Kotlin!", i.toString())
                textView3.text = i.toString()
            }
            for (element in SomeRepository.dataClassCopy()) {
                k++
                if (element.equals("Artem") && k == 1) {
                    textView4.text = "Android"
                    return@setOnClickListener
                } else Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
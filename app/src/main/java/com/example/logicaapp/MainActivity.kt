package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var totalCorrectAnswers: Int = 0
    var toastText = editText1.text.toString()
    val answer1 = editText1.text.toString()
    val answer2 = editText1.text.toString()
    val answer3 = editText1.text.toString()
    val answer4 = editText1.text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSubmit.setOnClickListener {
            submitAnswers()
            showToast()
            totalCorrectAnswers = 0
        }
    }

    private fun submitAnswers() {
        if (answer1 == "T") {
            totalCorrectAnswers++
        }
        if (answer2 == "F") {
            totalCorrectAnswers++
        }
        if (answer3 == "F") {
            totalCorrectAnswers++
        }
        if (answer4 == "F") {
            totalCorrectAnswers++
        }
    }

    private fun showToast() {
        toastText = "The number of correct answers: " + totalCorrectAnswers
        Toast.makeText(this, toastText, Toast.LENGTH_LONG).show()
    }
}

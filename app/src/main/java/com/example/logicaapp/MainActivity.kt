package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var totalCorrectAnswers = 0
    var toastText = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitBtn.setOnClickListener {
            submitAnswers()
            showToast()
            totalCorrectAnswers = 0
        }
    }

    private fun submitAnswers() {
        val answer01 = answer1.text.toString()
        val answer02 = answer2.text.toString()
        val answer03 = answer3.text.toString()
        val answer04 = answer4.text.toString()

        if (answer01 == "T") {
            totalCorrectAnswers++
        }
        if (answer02 == "F") {
            totalCorrectAnswers++
        }
        if (answer03 == "F") {
            totalCorrectAnswers++
        }
        if (answer04 == "F") {
            totalCorrectAnswers++
        }
    }

    private fun showToast() {
        toastText = "The number of correct answers: " + totalCorrectAnswers
        Toast.makeText(this, toastText, Toast.LENGTH_LONG).show()
    }
}

package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class activity_result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : TextView = findViewById(R.id.btn_finish)

        val TotalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val CorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tvScore.text = "Your score is $CorrectAnswers out of $TotalQuestions"

        btnFinish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}
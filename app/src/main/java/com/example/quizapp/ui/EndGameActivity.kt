package com.example.quizapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.quizapp.MainActivity
import com.example.quizapp.R
import nl.dionsegijn.konfetti.core.Party
import nl.dionsegijn.konfetti.core.emitter.Emitter
import java.util.concurrent.TimeUnit

class EndGameActivity : AppCompatActivity() {
    private lateinit var scoreTextView: TextView
    private lateinit var nameTextView: TextView
    private lateinit var restartButton: Button
    private lateinit var exitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_game)
        Party(
            emitter = Emitter(duration = 5, TimeUnit.SECONDS).perSecond(30)
        )
        var name = intent.getStringExtra("NAME").toString()
        var score = intent.getIntExtra("SCORE", 0).toInt()

        nameTextView = findViewById(R.id.name_text_view)
        scoreTextView = findViewById(R.id.score_text_view)
        restartButton = findViewById(R.id.restart_button)
        exitButton = findViewById(R.id.exit_button)

        scoreTextView.text = score.toString()
        nameTextView.text = name.toString()

        restartButton.setOnClickListener {
            Intent(this@EndGameActivity, MainActivity::class.java).also { startActivity(it) }
            finish()
        }

        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}
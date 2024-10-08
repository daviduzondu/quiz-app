package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import com.example.quizapp.ui.QuestionsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startBtn = findViewById<Button>(R.id.start_btn)
        val nameInput = findViewById<EditText>(R.id.name_input)

        startBtn.visibility = Button.GONE

        nameInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }

            override fun afterTextChanged(s: Editable?) {
                if (s.toString().isNotEmpty()){
                    startBtn.visibility = Button.VISIBLE
                }
            }
        })


        startBtn.setOnClickListener{
            Intent(this@MainActivity, QuestionsActivity::class.java).also {
                it.putExtra("NAME", nameInput.text.toString())
                startActivity(it)
            }
            finish()
        }
    }
}
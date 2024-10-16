package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import com.example.quizapp.ui.QuestionsActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        val = const
//        var = let
        val startBtn = findViewById<Button>(R.id.start_btn)
        val nameInput = findViewById<EditText>(R.id.name_input)
        val radioGroup = findViewById<RadioGroup>(R.id.question_count_radio_group)
        var questionCount = findViewById<RadioButton>(radioGroup.checkedRadioButtonId).toString().toIntOrNull()

        nameInput.requestFocus()
        startBtn.visibility = Button.GONE

        radioGroup.setOnCheckedChangeListener { _, checkedId -> questionCount = findViewById<RadioButton>(checkedId).text.toString().toIntOrNull()   }

        nameInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) { }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) { }

            override fun afterTextChanged(input: Editable?) {
                if (input.toString().isNotEmpty()){
                    startBtn.visibility = Button.VISIBLE
                }
            }
        })

        startBtn.setOnClickListener{
            val myIntent = Intent(this@MainActivity, QuestionsActivity::class.java)
            myIntent.putExtra("NAME", nameInput.text.toString())
            myIntent.putExtra("QUESTION_COUNT", questionCount)
            startActivity(myIntent)
            finish()
        }
    }
}

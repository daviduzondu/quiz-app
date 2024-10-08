package com.example.quizapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.widget.LinearLayoutCompat
import com.example.quizapp.R
import com.example.quizapp.model.Question
import com.example.quizapp.utils.Constants
import com.google.android.material.button.MaterialButton
import androidx.core.content.ContextCompat

class QuestionsActivity : AppCompatActivity() {
    private lateinit var progressBar: ProgressBar
    private lateinit var textViewProgress: TextView
    private lateinit var textViewQuestion: TextView
    private lateinit var image: ImageView
    private lateinit var questionsList: MutableList<Question>
    private lateinit var optionsContainer: LinearLayoutCompat
    private lateinit var nextButton: Button
    private var currentPosition: Int = 0 // Start from 0 to match list index
    private var selectedOption = 0
    private var name: String = "Default Name" // Default value
    private var score: Int = 0
    private lateinit var scoreTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        // Retrieve passed data or use default
        name = intent.getStringExtra("NAME") ?: "Default Name"
        questionsList = Constants.getQuestions(3).apply { shuffle() }

        // Initialize views
        progressBar = findViewById(R.id.progress_bar)
        textViewProgress = findViewById(R.id.text_view_progress)
        textViewQuestion = findViewById(R.id.question_text_view)
        optionsContainer = findViewById(R.id.options_container)
        scoreTextView = findViewById(R.id.score_text_view)
        nextButton = findViewById(R.id.next_btn)
        image = findViewById(R.id.image)

        // Set max value for progress bar
        progressBar.max = questionsList.size

        // Display the first question
        showNextQuestion()

        // Initially hide the next button
        nextButton.visibility = Button.GONE

        // Set click listener for the "Next" button
        nextButton.setOnClickListener {
            if (currentPosition < questionsList.size - 1) {
                currentPosition++
                showNextQuestion()
            } else {
                // End of the quiz, go to the end game screen
                val intent = Intent(this, EndGameActivity::class.java).apply {
                    putExtra("NAME", name)
                    putExtra("SCORE", score)
                }
                startActivity(intent)
                finish()
            }
        }
    }

    // Function to display the next question
    private fun showNextQuestion() {
        // Clear previous options
        optionsContainer.removeAllViews()

        // Hide the "Next" button until an answer is selected
        nextButton.visibility = Button.GONE

        // Get the current question
        val question = questionsList[currentPosition]

        // Set the question image (if any)
        if (question.image != null) {
            image.setImageResource(question.image)
        }

        // Update the progress bar and question counter
        progressBar.progress = currentPosition + 1
        textViewProgress.text = "${currentPosition + 1}/${questionsList.size}"
        textViewQuestion.text = question.question

        // Create option buttons dynamically
        for ((index, option) in question.options.withIndex()) {
            val button = MaterialButton(this).apply {
                text = option
                textSize = 20f
                setPadding(10, 20, 10, 20)

                // Use theme-aware colors for background and text
                strokeColor = ContextCompat.getColorStateList(this@QuestionsActivity, R.color.buttonColor)
                setTextColor(ContextCompat.getColor(this@QuestionsActivity, R.color.textColorPrimary))
                setBackgroundColor(ContextCompat.getColor(this@QuestionsActivity, R.color.button))

                layoutParams = LinearLayoutCompat.LayoutParams(
                    LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                    LinearLayoutCompat.LayoutParams.WRAP_CONTENT
                )

                // Handle option selection
                setOnClickListener {
                    selectedOption = index
                    val isCorrect = verifyUserSubmission()

                    // Update score if the answer is correct
                    if (isCorrect) {
                        score++
                        scoreTextView.text = "Score: $score"
                    }

                    // Disable further clicks and show feedback on options
                    for (i in question.options.indices) {
                        val buttonToCheck = optionsContainer.getChildAt(i) as MaterialButton
                        if (i == question.correctAnswer) {
                            // Correct answer is highlighted in green
                            buttonToCheck.setBackgroundColor(
                                ContextCompat.getColor(this@QuestionsActivity, R.color.buttonCorrect)
                            )
                        } else if (i == selectedOption && !isCorrect) {
                            // Incorrect answer is highlighted in red
                            buttonToCheck.setBackgroundColor(
                                ContextCompat.getColor(this@QuestionsActivity, R.color.buttonIncorrect)
                            )
                        }
                        // Disable further clicks on buttons
                        buttonToCheck.setOnClickListener(null)
                    }

                    // Show the "Next" button after a selection is made
                    nextButton.visibility = Button.VISIBLE
                }
            }
            // Add the option button to the container
            optionsContainer.addView(button)
        }
    }

    // Function to verify if the selected option is correct
    private fun verifyUserSubmission(): Boolean {
        return questionsList[currentPosition].correctAnswer == selectedOption
    }
}

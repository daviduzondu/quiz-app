package com.example.quizapp.utils

import com.example.quizapp.R
import com.example.quizapp.model.Question
import java.util.UUID


internal object Constants {
    fun getQuestions(elements: Int = 40): MutableList<Question> {
        val questions = mutableListOf<Question>()

        // Question 1
        val quest1 = Question(
            id = UUID.randomUUID(),
            question = "What country does this flag belong to?",
            image = R.drawable.nigeria_flag,
            options = listOf("Nigeria", "Cambodia", "Venezuela"),
            correctAnswer = 0
        )
        questions.add(quest1)

        // Question 2
        val quest2 = Question(
            id = UUID.randomUUID(),
            question = "What is the capital of Japan?",
            image = 0, // No image
            options = listOf("Beijing", "Tokyo", "Seoul"),
            correctAnswer = 1
        )
        questions.add(quest2)

        // Question 3
        val quest3 = Question(
            id = UUID.randomUUID(),
            question = "Which planet is known as the Red Planet?",
            image = 0,
            options = listOf("Earth", "Mars", "Jupiter"),
            correctAnswer = 1
        )
        questions.add(quest3)

        // Question 4
        val quest4 = Question(
            id = UUID.randomUUID(),
            question = "What is the largest mammal in the world?",
            image = 0,
            options = listOf("Elephant", "Blue Whale", "Giraffe"),
            correctAnswer = 1
        )
        questions.add(quest4)

        // Question 5
        val quest5 = Question(
            id = UUID.randomUUID(),
            question = "What is the chemical symbol for water?",
            image = 0,
            options = listOf("H2O", "O2", "CO2"),
            correctAnswer = 0
        )
        questions.add(quest5)

        // Question 6
        val quest6 = Question(
            id = UUID.randomUUID(),
            question = "Which continent is known as the Dark Continent?",
            image = 0,
            options = listOf("Asia", "Africa", "South America"),
            correctAnswer = 1
        )
        questions.add(quest6)

        // Question 7
        val quest7 = Question(
            id = UUID.randomUUID(),
            question = "What is the smallest prime number?",
            image = 0,
            options = listOf("1", "2", "3"),
            correctAnswer = 1
        )
        questions.add(quest7)

        // Question 8
        val quest8 = Question(
            id = UUID.randomUUID(),
            question = "What is the main ingredient in guacamole?",
            image = 0,
            options = listOf("Tomato", "Avocado", "Pepper"),
            correctAnswer = 1
        )
        questions.add(quest8)

        // Question 9
        val quest9 = Question(
            id = UUID.randomUUID(),
            question = "Which ocean is the largest?",
            image = 0,
            options = listOf("Atlantic Ocean", "Indian Ocean", "Pacific Ocean"),
            correctAnswer = 2
        )
        questions.add(quest9)

        // Question 10
        val quest10 = Question(
            id = UUID.randomUUID(),
            question = "What year did the Titanic sink?",
            image = 0,
            options = listOf("1912", "1905", "1898"),
            correctAnswer = 0
        )
        questions.add(quest10)

        // Question 11
        val quest11 = Question(
            id = UUID.randomUUID(),
            question = "What is the capital of France?",
            image = 0,
            options = listOf("Paris", "London", "Berlin"),
            correctAnswer = 0
        )
        questions.add(quest11)

        // Question 12
        val quest12 = Question(
            id = UUID.randomUUID(),
            question = "Which gas do plants absorb?",
            image = 0,
            options = listOf("Oxygen", "Carbon Dioxide", "Nitrogen"),
            correctAnswer = 1
        )
        questions.add(quest12)

        // Question 13
        val quest13 = Question(
            id = UUID.randomUUID(),
            question = "What is the hardest natural substance on Earth?",
            image = 0,
            options = listOf("Gold", "Diamond", "Iron"),
            correctAnswer = 1
        )
        questions.add(quest13)

        // Question 14
        val quest14 = Question(
            id = UUID.randomUUID(),
            question = "How many continents are there?",
            image = 0,
            options = listOf("5", "6", "7"),
            correctAnswer = 2
        )
        questions.add(quest14)

        // Question 15
        val quest15 = Question(
            id = UUID.randomUUID(),
            question = "What is the largest desert in the world?",
            image = 0,
            options = listOf("Sahara", "Arabian", "Antarctic"),
            correctAnswer = 2
        )
        questions.add(quest15)

        // Question 16
        val quest16 = Question(
            id = UUID.randomUUID(),
            question = "Which animal is known as the 'King of the Jungle'?",
            image = 0,
            options = listOf("Tiger", "Lion", "Elephant"),
            correctAnswer = 1
        )
        questions.add(quest16)

        // Question 17
        val quest17 = Question(
            id = UUID.randomUUID(),
            question = "What is the capital of Australia?",
            image = 0,
            options = listOf("Sydney", "Melbourne", "Canberra"),
            correctAnswer = 2
        )
        questions.add(quest17)

        // Question 18
        val quest18 = Question(
            id = UUID.randomUUID(),
            question = "What is the longest river in the world?",
            image = 0,
            options = listOf("Amazon", "Nile", "Yangtze"),
            correctAnswer = 1
        )
        questions.add(quest18)

        // Question 19
        val quest19 = Question(
            id = UUID.randomUUID(),
            question = "Which element has the chemical symbol 'Fe'?",
            image = 0,
            options = listOf("Iron", "Gold", "Silver"),
            correctAnswer = 0
        )
        questions.add(quest19)

        // Question 20
        val quest20 = Question(
            id = UUID.randomUUID(),
            question = "What is the primary language spoken in Brazil?",
            image = 0,
            options = listOf("Spanish", "Portuguese", "English"),
            correctAnswer = 1
        )
        questions.add(quest20)

        // Question 21
        val quest21 = Question(
            id = UUID.randomUUID(),
            question = "Which famous scientist developed the theory of relativity?",
            image = 0,
            options = listOf("Isaac Newton", "Albert Einstein", "Galileo Galilei"),
            correctAnswer = 1
        )
        questions.add(quest21)

        // Question 22
        val quest22 = Question(
            id = UUID.randomUUID(),
            question = "What is the main ingredient in bread?",
            image = 0,
            options = listOf("Flour", "Sugar", "Salt"),
            correctAnswer = 0
        )
        questions.add(quest22)

        // Question 23
        val quest23 = Question(
            id = UUID.randomUUID(),
            question = "What is the currency of Japan?",
            image = 0,
            options = listOf("Yen", "Dollar", "Euro"),
            correctAnswer = 0
        )
        questions.add(quest23)

        // Question 24
        val quest24 = Question(
            id = UUID.randomUUID(),
            question = "Who painted the Mona Lisa?",
            image = 0,
            options = listOf("Vincent Van Gogh", "Pablo Picasso", "Leonardo da Vinci"),
            correctAnswer = 2
        )
        questions.add(quest24)

        // Question 25
        val quest25 = Question(
            id = UUID.randomUUID(),
            question = "What is the largest planet in our solar system?",
            image = 0,
            options = listOf("Saturn", "Earth", "Jupiter"),
            correctAnswer = 2
        )
        questions.add(quest25)

        // Question 26
        val quest26 = Question(
            id = UUID.randomUUID(),
            question = "What is the speed of light?",
            image = 0,
            options = listOf("300,000 km/s", "150,000 km/s", "400,000 km/s"),
            correctAnswer = 0
        )
        questions.add(quest26)

        // Question 27
        val quest27 = Question(
            id = UUID.randomUUID(),
            question = "What is the tallest mountain in the world?",
            image = 0,
            options = listOf("K2", "Kangchenjunga", "Mount Everest"),
            correctAnswer = 2
        )
        questions.add(quest27)

        // Question 28
        val quest28 = Question(
            id = UUID.randomUUID(),
            question = "Which planet is known for its rings?",
            image = 0,
            options = listOf("Mars", "Jupiter", "Saturn"),
            correctAnswer = 2
        )
        questions.add(quest28)

        // Question 29
        val quest29 = Question(
            id = UUID.randomUUID(),
            question = "What is the hardest rock?",
            image = 0,
            options = listOf("Marble", "Granite", "Diamond"),
            correctAnswer = 2
        )
        questions.add(quest29)

        // Question 30
        val quest30 = Question(
            id = UUID.randomUUID(),
            question = "What is the smallest country in the world?",
            image = 0,
            options = listOf("Monaco", "Vatican City", "San Marino"),
            correctAnswer = 1
        )
        questions.add(quest30)

        // Question 31
        val quest31 = Question(
            id = UUID.randomUUID(),
            question = "Who was the first President of the United States?",
            image = 0,
            options = listOf("George Washington", "Abraham Lincoln", "Thomas Jefferson"),
            correctAnswer = 0
        )
        questions.add(quest31)

        // Question 32
        val quest32 = Question(
            id = UUID.randomUUID(),
            question = "What is the capital of Canada?",
            image = 0,
            options = listOf("Toronto", "Vancouver", "Ottawa"),
            correctAnswer = 2
        )
        questions.add(quest32)

        // Question 33
        val quest33 = Question(
            id = UUID.randomUUID(),
            question = "In which year did World War II end?",
            image = 0,
            options = listOf("1945", "1944", "1946"),
            correctAnswer = 0
        )
        questions.add(quest33)

        // Question 34
        val quest34 = Question(
            id = UUID.randomUUID(),
            question = "What is the largest organ in the human body?",
            image = 0,
            options = listOf("Heart", "Liver", "Skin"),
            correctAnswer = 2
        )
        questions.add(quest34)

        // Question 35
        val quest35 = Question(
            id = UUID.randomUUID(),
            question = "What is the primary ingredient in sushi?",
            image = 0,
            options = listOf("Rice", "Noodles", "Fish"),
            correctAnswer = 0
        )
        questions.add(quest35)

        // Question 36
        val quest36 = Question(
            id = UUID.randomUUID(),
            question = "What is the first element on the periodic table?",
            image = 0,
            options = listOf("Helium", "Hydrogen", "Lithium"),
            correctAnswer = 1
        )
        questions.add(quest36)

        // Question 37
        val quest37 = Question(
            id = UUID.randomUUID(),
            question = "Which famous landmark is located in Egypt?",
            image = R.drawable.pyramids, // Example image, replace with actual resource if available
            options = listOf("Great Wall", "Pyramids", "Stonehenge"),
            correctAnswer = 1
        )
        questions.add(quest37)

        // Question 38
        val quest38 = Question(
            id = UUID.randomUUID(),
            question = "Which is the largest continent?",
            image = 0,
            options = listOf("Africa", "Asia", "North America"),
            correctAnswer = 1
        )
        questions.add(quest38)

        // Question 39
        val quest39 = Question(
            id = UUID.randomUUID(),
            question = "What is the most spoken language in the world?",
            image = 0,
            options = listOf("English", "Mandarin", "Spanish"),
            correctAnswer = 1
        )
        questions.add(quest39)

        // Question 40
        val quest40 = Question(
            id = UUID.randomUUID(),
            question = "What is the common name for dried plums?",
            image = 0,
            options = listOf("Raisins", "Dates", "Prunes"),
            correctAnswer = 2
        )
        questions.add(quest40)

        return questions.take(elements) as MutableList<Question>
    }
}

package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()

        // 1
        val ques1 = Questions(
            1,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_squirtle,
            optionOne = "Caterpie",
            optionTwo = "Weedle",
            optionThree = "Pidgey",
            optionFour = "Squirtle",
            correctAnswer = 4
        )
        questionsList.add(ques1)

        // 2
        val ques2 = Questions(
            2,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_mewoth,
            optionOne = "Meowth",
            optionTwo = "Psyduck",
            optionThree = "Mankey",
            optionFour = "Growlithe",
            correctAnswer = 1
        )
        questionsList.add(ques2)

        // 3
        val ques3 = Questions(
            3,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_jiglypuff,
            optionOne = "Oddish",
            optionTwo = "Jgglypuff",
            optionThree = "Cleffa",
            optionFour = "Vulpix",
            correctAnswer = 2
        )
        questionsList.add(ques3)

        // 4
        val ques4 = Questions(
            4,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_oddish,
            optionOne = "Paras",
            optionTwo = "Oddish",
            optionThree = "Venonat",
            optionFour = "Diglett",
            correctAnswer = 2
        )
        questionsList.add(ques4)

        // 5
        val ques5 = Questions(
            5,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_growlith,
            optionOne = "Growlithe",
            optionTwo = "Abra",
            optionThree = "Machop",
            optionFour = "Bellsprout",
            correctAnswer = 1
        )
        questionsList.add(ques5)

        // 6
        val ques6 = Questions(
            6,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_charmander,
            optionOne = "Squirtle",
            optionTwo = "Charmander",
            optionThree = "Pikachu",
            optionFour = "Weedle",
            correctAnswer = 2
        )
        questionsList.add(ques6)

        // 7
        val ques7 = Questions(
            7,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_machop,
            optionOne = "Tentacool",
            optionTwo = "Machop",
            optionThree = "Bellsprout",
            optionFour = "Geodude",
            correctAnswer = 2
        )
        questionsList.add(ques7)

        // 8
        val ques8 = Questions(
            8,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_belsprout,
            optionOne = "Bellsprout",
            optionTwo = "Tentacool",
            optionThree = "Geodude",
            optionFour = "Ponyta",
            correctAnswer = 1
        )
        questionsList.add(ques8)

        // 9
        val ques9 = Questions(
            9,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_poliwag,
            optionOne = "Abra",
            optionTwo = "Growlithe",
            optionThree = "Mankey",
            optionFour = "Pliwag",
            correctAnswer = 4
        )
        questionsList.add(ques9)

        // 10
        val ques10 = Questions(
            10,
            "Which Pokémon is this?",
            R.drawable.ic_pic_of_muk,
            optionOne = "Muk",
            optionTwo = "Voltrob",
            optionThree = "Marowak",
            optionFour = "Horsea",
            correctAnswer = 1
        )
        questionsList.add(ques10)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)
//
//        // 2
//        val ques2 = Questions(
//            1,
//            "Which Pokémon is this?",
//            R.drawable.ic_pic_of_mewoth,
//            optionOne = "Meowth",
//            optionTwo = "Psyduck",
//            optionThree = "Mankey",
//            optionFour = "Growlithe",
//            correctAnswer = 1
//        )
//        questionsList.add(ques2)

        return questionsList
    }
}
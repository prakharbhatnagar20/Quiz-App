package com.example.quizapp

object Constants {
    const val USER_NAME : String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    fun getQuestions():ArrayList<Questions>{
        val questionList = ArrayList<Questions>()
        val ques1 = Questions(
            1, "What country does this flag belong to?", R.drawable.argentina,
            "Australia", "Argentina", "Austria", "Afghanistan",
            2

        )
        questionList.add(ques1)
        val ques2 = Questions(
            2, "What country does this flag belong to?", R.drawable.aghanistan ,
            "Ukraine", "Pakistan", "Kazakhstan", "Afghanistan",
            4

        )
        questionList.add(ques2)
        val ques3 = Questions(
            3, "What country does this flag belong to?", R.drawable.ghana ,
            "Egypt", "Ghana", "Syria", "Nigeria",
            2

        )
        questionList.add(ques3)
        val ques4 = Questions(
            4, "What country does this flag belong to?", R.drawable.usa ,
            "USA", "Iran", "India", "Afghanistan",
            1

        )
        questionList.add(ques4)
        val ques5 = Questions(
            5, "What country does this flag belong to?", R.drawable.iran ,
            "Iraq", "Somalia", "Mongolia", "Iran",
            4

        )
        questionList.add(ques5)
        val ques6 = Questions(
            6, "What country does this flag belong to?", R.drawable.bahrain ,
            "Japan", "China", "Bahrain", "Saudi Arabia",
            3

        )
        questionList.add(ques6)
        val ques7 = Questions(
            7, "What country does this flag belong to?", R.drawable.brazil ,
            "Peru", "Brazil", "Vietnam", "Chile",
            2

        )
        questionList.add(ques7)
        val ques8 = Questions(
            8, "What country does this flag belong to?", R.drawable.myanmar ,
            "Myanmar", "Cambodia", "Thailand", "Malaysia",
            1

        )
        questionList.add(ques8)
        val ques9 = Questions(
            9, "What country does this flag belong to?", R.drawable.canada ,
            "Mexico", "Canada", "Italy", "Peru",
            2

        )
        questionList.add(ques9)
        return questionList
    }
}
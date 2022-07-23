package com.example.gradelookup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var korean: EditText
    lateinit var math: EditText
    lateinit var gym: EditText
    lateinit var social: EditText
    lateinit var music: EditText
    lateinit var result1: TextView
    lateinit var result2: TextView
    lateinit var resultBtn: Button


    // 학생 5명의 성적을 입력 받은 후, 평균점수와 최고 점수를 출력하는 프로그램을 작성 하시오.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        korean = findViewById(R.id.korean)
        math = findViewById(R.id.math)
        gym = findViewById(R.id.gym)
        social = findViewById(R.id.social)
        music = findViewById(R.id.music)
        resultBtn = findViewById(R.id.resultBtn)
        result1 = findViewById(R.id.result1)
        result2 = findViewById(R.id.result2)

        resultBtn.setOnClickListener {
            var grade = mutableListOf<String>()

            grade.add(korean.text.toString())
            grade.add(math.text.toString())
            grade.add(gym.text.toString())
            grade.add(social.text.toString())
            grade.add(music.text.toString())

            var highNum = 0
            var sum = 0

            for (str in grade) {
                // 배열에 들어있는 값이 문자열이기 때문에 계산을 하기위해서는 string -> int
                println(str)
                var str2 = str.toString().toInt()
                // 최고점 구하기
                // highnum이랑 str 을 비교해서 highnum이 더 크면 아무것도 안하고 넘어감, str더 크면 highnum에 str값을 저장
                if (highNum < str2) {
                    highNum = str2
                }
                // 평균 구하기
                // 평균 = 총합 / 과목의 갯수
                sum = sum + str2
                // 총합을 구하기위해서는 sum = sum + str


            }
            // 총합/과목의 수 해서 출력
            result1.text = "$highNum"
            // highnum 출력
            result2.text = "${sum / grade.size}"

        }

    }

}
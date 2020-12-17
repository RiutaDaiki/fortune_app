package com.example.yourfourtune

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        fun getNumber() {

            val firstText:String = firstNumber.text.toString()
            val secondText = secondNumber.text.toString()



            val map1 = mapOf("0" to "なかなか", "1" to "まずまず", "2" to "とても", "3" to "めっちゃ", "4" to "相当","5" to "とんでもなく", "6" to "SUPER","7" to "DX", "8" to "お前だけは", "9" to "おそらく")
            val map2 = mapOf("0" to "大吉", "1" to "庄吉", "2" to "小吉", "3" to "茂吉", "4" to "中吉","5" to "大凶", "6" to "たぬきち","7" to "こっちみんな", "8" to "無吉", "9" to "ナイス！")

            val makeResult = map1[firstText] + map2[secondText]

//            println(firstText)

            fortuneBtn.setOnClickListener {

                resultText.text = makeResult



            }

        }
        getNumber()



//        fortuneBtn.setOnClickListener {
//            val firstText:String = firstNumber.text.toString()
//            val secondText = secondNumber.text.toString()
//
//
//            println(firstText)
//
//            val map1 = mapOf("0" to "なかなか", "1" to "まずまず", "2" to "とても", "3" to "めっちゃ", "4" to "相当","5" to "とんでもなく", "6" to "SUPER","7" to "DX", "8" to "お前だけは", "9" to "おそらく")
//            val map2 = mapOf("0" to "大吉", "1" to "庄吉", "2" to "小吉", "3" to "茂吉", "4" to "中吉","5" to "大凶", "6" to "たぬきち","7" to "こっちみんな", "8" to "無吉", "9" to "ナイス！")
//
//            val makeResult = map1[firstText] + map2[secondText]
//            resultText.text = makeResult
//        }
    }

}
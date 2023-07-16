package com.initial.lec05

import java.lang.IllegalArgumentException


/**
 * java 에서 if-else는 statment지만
 * 코틀린에서는 expression
 * statement : 프로그램의 문장 전체를 의미 즉 하나의 값으로 도출이 되지않음
 * expression : 하나의 값으로 도출됨
 * ex) 30+40은 스테이트먼트면서 익스프레션
 * 만약 String k = if(score >=50){
 * }else if
 * 이렇게 했다면 자바에서는 하나의 값이 아니니까 에러뜸
 *
 * 하지만 코틀린에서는 가능함
 */
fun validateScoreIsNotNegative(score: Int){
    if(score !in 0..100){
        throw IllegalArgumentException("score의 범위는 0부터100이어야함")
    }
}

fun getPassOrFail(score: Int) : String{
    return if(score>=50){
         "P"

    }else{
         "N"
    }
}

fun getGrade(score : Int): String{
    return if(score>=90)
                "A"
        else if(score>= 80){
            "B"
        }
    else{
        "D"
    }
}

fun getGradeWithSwithch(score: Int):String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithSwithch2(score: Int):String {
   return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWith(obj: Any): Boolean{
    return when (obj){
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun judgeNumber(number: Int){
    when (number) {
        1,0,-1 -> println("어디서 많이 본 숫자입니다")
        else -> println("-1,0,1이 아닙니")
    }
}

fun judgeNumber2(number : Int){
    when{
        number ==0 -> println("주어진 숫자는 0입니다")
        number %2 == 0 -> println("주어진 숫자는 짝수입니다")
        else -> println("주어지는 숫자는 홀수입니다")
    }
}



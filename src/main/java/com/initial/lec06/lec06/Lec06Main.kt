package com.initial.lec06.lec06

fun main(){
    val numbers = listOf(1L,2L,3L)
    for (number in numbers){
        println(number)
    }

    for(i in 1..3){
        print(i)
    }
    for(i in  3 downTo 1){
        print(i)
    }
    for(i in 1..5 step 2)
        print(i)

    /**
     * IntRange는 IntProgression을 상속받고있음 그게 ..임
     * 중위함수호출을사용
     */

    var i =1
    while( i<=3 ){
        println(i)
        i++
    }
}
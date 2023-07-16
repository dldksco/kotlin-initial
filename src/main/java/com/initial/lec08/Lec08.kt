package com.initial.lec08

/**
 * 코틀린에서 자바를 가져다 쓸 때는 named argument사용불가
 */
fun main(){
    repeat("hello World",3,false)
    repeat("hello World",useNewLine=false)
    printAll("A","B","C")
    val array = arrayOf("A","B","C")

    printAll(*array)//spread 연산자
}
fun max (a: Int, b : Int)= if (a>= b) a else b

fun repeat(
    str: String,
    num: Int =3,
    useNewLine: Boolean = true
){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}
fun printNameAndGender(name: String, gender:String){
    println(name)
    println(gender)
}

fun printAll(vararg strings: String){
    for(str in strings){
        print(str)
    }
}
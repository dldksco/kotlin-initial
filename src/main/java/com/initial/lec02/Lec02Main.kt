package com.initial.lec02

import java.lang.IllegalArgumentException

fun main(){
//    val str: String? = "ABC"
//    str.length 불가능
//    str?.length safe call로 인해 가능 널이 아닐때만 실행해줘 널이면 전체가 널이됨
//    str?.length ?: 0 Elvis 연산자 앞에가 널이면 전체가 0이됨
}

fun startsWitA1(str : String?): Boolean{
//    if (str==null){
//        throw IllegalArgumentException("null이 들어왔습니다")
//    }
//    return str.startsWith("A")

    return str?.startsWith("A") ?: throw IllegalArgumentException("Null이 들어옴")
}

fun startsWithA2(str: String?): Boolean?{
//    if(str ==null){
//        return null
//    }
//
//    return str.startsWith("A")
    return str?.startsWith("A")
}

/**
 * 위에서 널체크를 해주면 컴파일러가 알아서 널이 아니라고 추출해
 */
fun startsWithA3(str : String?): Boolean{
//    if(str ==null){
//        return false
//    }
//
//    return str.startsWith("A")
    return str?.startsWith("A")?: false
}

fun startsWith(str : String?): Boolean{
//    절대 null이 아님
    //근데 null이 들어왔다? 그럼 런타임 상황에서 널포인터에러뜸
    return str!!.startsWith("A")
}
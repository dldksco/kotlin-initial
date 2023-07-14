package com.initial.lec01

fun main(){
    /**
     * 가변은 variable의 약자인 var
     *
     * 불변은 valuable의 약자인 val
     *
     * 모든 변수에 수정가능 여부를 알려줘야함
     */
//    var number1 = 10L
    //타입 명시적 작성 가능
//    var number1: Long = 10L
//    초기값을 지정해주지 않으면 타입 명시해줘야함 또한 값을 안넣어줄려고하면 에러발생함
    var number1 : Long
    number1 = 1L
    /**
     * 숫자 문자 불리언과 같은 몇몇 타입은 내부적으로 특별한 타입을 가짐
     * 래퍼클래스로 보이더라도 내부에서 알아서 primitive로 바꿔줌
     *
     * 기본적으로 모든 변수에 널을 들어갈 수 없게 만들어둠 가능하게할려면 ?붙혀야함
     */
    var number3: Long? = 1_000L
    number3 = null

    /**
     * 객체 인스턴스화 할 때 new가 필요없음
     */
    var person = Person("이안채")

    val number2 = 10L
//    number2=1L
}
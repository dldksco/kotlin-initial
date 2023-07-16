package com.initial.lec09

fun main(){
    val person = Person("이안채", 100)
    print(person.name)
    person.age = 10
    print(person.age)
    //자바로 만들어진 클래스도 .field로 가능함
}
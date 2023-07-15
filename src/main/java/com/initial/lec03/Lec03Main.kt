package com.initial.lec03

/**
 * 코틀린의 특이한 타입 - Any
 * java의 object 역할(모든 객체의 최상위 타입)
 * 모든 Primitive Type의 최상의 타입도 Any이다.
 * Any 자체로는 null을 포함할 수 없어 null을  포함하고 싶다면 Any?로 표현
 *
 * Any에 equals/hashcode/toString존재
 */

/**
 * 코틀린의 특이한 타입 - Unit
 * Unit은 java의 void와 동일
 * void와 다르게 unit은 그 자체로 타입 인자로 사용 가능 (제너릭에서 void를 쓸려면 Void를 가져와야되는데 Unit은 그 자체로 가능)
 * 함수형 프로그래밍에서 Unit은 단 하나의 인스턴스만 갖는 타입을 의미 즉 코틀린의 Unit은 실제 존재하는 타입이라는 것을 표현
 *
 */

/**
 * 코틀린의 특이한 타입 - Noting
 *
 * 함수가 정상적으로 끝나지 않았다는 사실을 표현
 *
 * 무조건 예외를 반환하는 함수 / 무한 루프 함수
 */

/**
 * String interpolation / String indexing
 * ${person.name}처럼 ${변수}를 사용하면 값이 들어감
 */

fun main(){
    /**
     * 코틀린에서는 선언된 기본값을 보고 타입을 추론함
     * 자바 -> 기본 타입간의 변환은 암시적으로 이루어짐
     * 코틀린 -> 기본 타입간의 변환은 명시적으로 이루어져야함
     * to변환타입을 사용해야함
     */
    val number1 =3 //Int
    val number2 = 3L //Long
    val number3 = 3.0f //float
    val number4 = 3.0 //double

    val number5: Int =4
    val number6: Long = number5.toLong()

    val number7 =3
    val number8 =5
    val result = number7 / number8.toDouble()


    val number9: Int? = 3
    val number10: Long = number9?.toLong() ?:0L // safe call과 elvis 연산자 이용


}

fun printAgeIfPerson(obj: Any){
    //instance of 대신 is 사용
    if (obj is Person) {
//        val person = obj as Person
        //생략도 가능 스마트 캐스트라고함 타입체크를 한 번 해주면 알아서해줌
        println(obj.age)
    }
}

fun printAgeIfNotPerson(obj: Any){

    if (obj !is Person) {

    }
}

fun printAgeIfPersonIsNull(obj: Any?){
//    val person = obj as Person 이렇게하면 널가능
    val person = obj as? Person // 이렇게하면 nullable
    // 즉 val person: Person? = obj as? Person과 동치
    println(person?.age)
}
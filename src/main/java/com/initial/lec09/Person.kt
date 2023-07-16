package com.initial.lec09

import java.lang.IllegalArgumentException

//주 생성자 반드시 존재해야함 근데 파라미터가 하나도 없으면 없어도됨
/**
 * 만약 두번째 부생성자 호출하면 어떻게될까? 타고타고 올라가서 초기화 -> 첫번째 -> 두번째 순으로 바디가 호출됨 즉 본문은 역순
 * 하지만 코틀린은 그냥 default constructor를 권장함
 * 하지만 어떤 객체를 다른 객체로 바꿀때는 부생성자를 사용할 수 있지만 정적팩토리메소드를 더 추천함
 */
class Person(
     name: String
    , var age: Int){
    init{
        if(age<=0){
            throw IllegalArgumentException("나이는 ${age}밑일수업어")
        }
        print("초기화")
    }
    //field는 보이지않는 필드다해서 backing field라고함
    /**
     * 근데 그냥 this. 사용하면되니까 거의 안써도 될 듯
     *
     */
    val name = name
        get() = field.uppercase();

    /**
     * val name = name
     *         get() = name.uppercase();
     * 얘는 name을 계속해서 순환참조돼서 안됨
     */


    /**
     *
     *    var name: String = name
     *         set(value){
     *             field = value.uppercase()
     *
     *         }
     *
     */


    //부생성자
    //두번째 생성자를 호출하면 걔가 첫번째 부생성자호출 걔가 다시 주생성자호출
    constructor(name: String): this(name, 1){
        print("첫 번째")
    }
    constructor(): this("홍길동"){
        print("두 번")
    }


    /**
     * 세가지 방법 모두 같
     * 함수에 접근하는거냐 메소드로 접근하는 거냐 그 차이임
     */
    fun isAdult(): Boolean{
        return this.age>=20
    }
//함수대신 프로퍼티처럼 만들 수 있음
    val isAdult: Boolean
        get() = this.age>=20

    val isAdult2: Boolean
        get(){
            return this.age >=20
        }




}

//class Person constructor(name : String, age: Int){
//    val name : String =name
//    var age : Int = age
//}
// class Person (name : String, age: Int){
//    val name : String =name
//    var age : Int = age
//}




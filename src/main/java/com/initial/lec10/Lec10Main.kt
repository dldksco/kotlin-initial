package com.initial.lec10

/**
 * 자바와 코틀린 모두 추상 클래스는 인스턴스화할수없다
 * 둘 다 인터페이스도 인스턴스화 불가
 * 코틀린에서는 backing field가 없는 프로퍼티를 interface에 만들 수 있음
 * 프로퍼티라는게 필드라는 것도 있지만 게터도있기 때문에 어떻게 보면 getter에 대한 default메소드나 getter에 대한 추상 메소드를 인터페이스에 만드는 거임
 *
 */
fun main(){
    Derived(300)
}


/**
 * final override를 할 수 없게함 default
 * open override를 열어줌
 * abstract 반드시 override해야함
 * override 상위타입을 오버라이드하고있음
 */


/**
 * 상위 클래스를 설계할 때
 * 생성자 또는 초기화 블록에 사용되는 프로퍼에는 open을 피해야
 */
open class Base(
    open val number: Int =100
){
    init{
        print("base")
        /**
         * 이러면 0 이 나옴
         * 상위 클래스에서 넘버를 호출하게 되면 하위클래스의 number를 호출하는데
         * 근데 아직 하위클래스가 초기화가 되지않았기때문에 int의 기본값인 0을가져옴
         */
        print(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init{
        print("de")
    }
}
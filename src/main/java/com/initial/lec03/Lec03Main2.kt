package com.initial.lec03

/**
 * 코틀린의 변수는 초기값을 보고 타입을 추론 또한 변환은 묵시적이 아닌 명시적으로
 * 코틀린에ㅓ는 is, !is, as , as?를 이용해 타입을 확인 후 캐스팅
 * 코틀린의 any는 java의 object와 같음
 * 코틀린의 unit은 java의 void와 동일
 * 코틀린의 nothing은 정상적으로 끝나지 않 함수의 반환을 의미
 * 문자열을 가공할때 ${변수}와 """를사용하면 편함
 *
 */
fun main() {
    val person = Person("이안채", 28)
    //자바식
    System.out.println(String.format("이름 : %s", person.name))
    //코틀린식
    println("이름 : ${person.name}")

    val name = "최태현"
    println("이름 : $name")
    /**
     * 그래도 중괄호를 사용하는게 가독성 면에서 더 좋음
     */

val str=    """
   ABC
        EFG
        ${name}
    """.trimIndent()


}
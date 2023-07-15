package com.initial.lec02

import java.lang.IllegalArgumentException

fun main(){
    val person = Person("dldksco")
//    startsWithA(person.name) person이 @Nullable이면 빨간줄
    /**
     * @NotNull이면 괜찮음
     * 자바 코드를 가져다 쓸때는 코틀린이 자바코드를 이해함\
     * 만약 정보가 없다면? 플랫폼 타입이라고함 즉 코틀린이 알 수 없는타입
     * 이럴 때는 런타임때 에러가 발생함
     *
     * 즉 코틀린에서 자바코드를 쓸때는 꼼꼼히 작성해줘야함
     * 아니면 래핑을해서 단일지점으로 만들어 이슈 발생시 쉽게 처리하게 만들어둠
     */
    startsWithA(person.name)

}

fun startsWithA(str: String): Boolean{
    return str.startsWith("A")
}

package com.initial.lec04

fun main(){
    /**
     * 비교연산자 상항이되면 compare to를 자동으로 호출해줌
     * 자바에서는 compareTo를 한다면 직관적으로 이해 어려웠
     */
    val money1  = JavaMoney(2_000L)
    val money2  = JavaMoney(3_000L)
    if (money1>money2)
        println("Money1이 money2보다 큼")

    /**
     * 동일성에 === 주소
     * 동등성에 ==  equals
     *
     */

    val money3 = money2
    println(money1 == money2)
    /**
     * lazy loading fun1()은 어차피 트루니까 뒤에꺼 볼필요도 없이 fun2()를 호출하지 않음
     * 만약 &&였으면 fun1()1가 펄스였다면 바로 탈출
     */
    if(fun1() || fun2())
        print("본문")


    //이게 됨
    //객체마다 직접 정의할 수 있음
    println(money1 + money2)
}


fun fun1() : Boolean{
    println("fun1")
    return true
}

fun fun2(): Boolean{
    println("fun2")
    return false
}
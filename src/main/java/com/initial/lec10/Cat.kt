package com.initial.lec10

class Cat(
    species: String
) : Animal(species, legCount = 4) {

    override fun move() {
        print("고양이가 사뿐")
    }

}
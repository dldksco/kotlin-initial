package com.initial.lec10

class Penguin(
 species : String
) : Animal(species , legCount = 2), Swimable, Flyable  {

    private val wingCount : Int =2

    override fun move() {
        print("펭귄이 움직여")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Flyable>.act()
        super<Swimable>.act()
    }

    override val swimAbility: Int
        get() = super.swimAbility
}

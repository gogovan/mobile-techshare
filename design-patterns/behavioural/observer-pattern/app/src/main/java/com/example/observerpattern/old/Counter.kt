package com.example.observerpattern.old

import kotlin.random.Random

/**
 * Without Observer pattern
 */
class Counter {
    private var counter = 0
    private val objects = mutableListOf<Any>()

    fun add(p: Any) {
        objects.add(p)
    }

    fun update() {
        counter += Random.nextInt(1, 10)
        objects.forEach {
            if (it is Printer) {
                it.print(counter)
            } else if (it is Calculator) {
                it.calculate(counter)
            }
        }
    }
}
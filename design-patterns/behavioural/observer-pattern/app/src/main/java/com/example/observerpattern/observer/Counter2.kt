package com.example.observerpattern.observer

import kotlin.random.Random

/**
 * With Observer pattern
 */
interface Receiver {
    fun print(x: Int)
}

class Counter2 {
    private var counter = 0
    private val observers = mutableListOf<Receiver>()

    fun add(p: Receiver) {
        observers.add(p)
    }

    fun update() {
        counter += Random.nextInt(1, 10)
        observers.forEach { it.print(counter) }
    }
}
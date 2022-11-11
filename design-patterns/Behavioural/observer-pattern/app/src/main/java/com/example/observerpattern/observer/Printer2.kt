package com.example.observerpattern.observer

class Printer2(private val name: String) : Receiver {
    override fun print(x: Int) {
        println("Printer $name prints $x");
    }
}
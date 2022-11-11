package com.example.observerpattern.old

class Printer(private val name: String) {
    fun print(x: Int) {
        println("Printer $name prints $x");
    }
}
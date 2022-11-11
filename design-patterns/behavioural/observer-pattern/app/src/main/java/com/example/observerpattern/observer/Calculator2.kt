package com.example.observerpattern.observer

class Calculator2: Receiver {
    override fun print(x: Int) {
        println("Calculation result = ${x*x}")
    }
}
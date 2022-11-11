package com.example.observerpattern.observer

/**
 * With Observer pattern
 */
fun main() {
    val counter = Counter2()

    val printer1 = Printer2("Alice")
    val printer2 = Printer2("Bob")
    val calculator = Calculator2()

    counter.add(printer1)
    counter.add(printer2)
    counter.add(calculator)

    counter.update()
}
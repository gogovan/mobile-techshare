package com.example.observerpattern.old

/**
 * Without Observer pattern
 */
fun main() {
    val counter = Counter()

    val printer1 = Printer("Alice")
    val printer2 = Printer("Bob")
    val calculator = Calculator()

    counter.add(printer1)
    counter.add(printer2)
    counter.add(calculator)

    counter.update()
}


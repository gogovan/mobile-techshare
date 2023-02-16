package com.example.old

open class RemoteControl {

    open fun turnOn() {
        println("Turning on the machine")
    }

    open fun turnOff() {
        println("Turning off the machine")
    }

    open fun setChannel(channel: Int) {
        println("Setting the channel to $channel")
    }
}
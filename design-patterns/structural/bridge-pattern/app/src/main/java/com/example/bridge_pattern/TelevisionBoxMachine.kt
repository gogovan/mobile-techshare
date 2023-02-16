package com.example.bridge_pattern

class TelevisionBoxMachine: TheMachineInterface {
    override fun turnOn() {
        println("Turning on the TV box")
    }

    override fun turnOff() {
        println("Turning off the TV box")
    }

    override fun setChannel(channel: Int) {
        println("Setting the channel of the TV box to $channel")
    }

    fun mute() {
        println("Setting the volume of the TV box to mute")
    }
}
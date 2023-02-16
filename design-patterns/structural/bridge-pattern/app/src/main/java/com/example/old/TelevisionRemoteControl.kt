package com.example.old

class TelevisionRemoteControl: RemoteControl() {
    override fun turnOn() {
        println("Turning on the TV")
    }

    override fun turnOff() {
        println("Turning off the TV")
    }

    override fun setChannel(channel: Int) {
        println("Setting the channel of the TV to $channel")
    }
}
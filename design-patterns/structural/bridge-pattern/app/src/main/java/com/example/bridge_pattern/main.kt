package com.example.bridge_pattern

fun main() {
    val televisionMachine = TelevisionMachine()
    val televisionBoxMachine = TelevisionBoxMachine()
    val televisionRemoteControl = NormalTVRemoteControlBridge(televisionMachine)
    val televisionBoxRemoteControl = AdvancedTVRemoteControlBridge(televisionBoxMachine)

    televisionRemoteControl.turnOff()
    televisionRemoteControl.turnOn()
    televisionRemoteControl.setChannel(10)
    println("------------------------------------")
    televisionBoxRemoteControl.turnOn()
    televisionBoxRemoteControl.setChannel(20)
    televisionBoxRemoteControl.turnOff()
    televisionBoxMachine.mute()
}
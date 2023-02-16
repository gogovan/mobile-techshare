package com.example.bridge_pattern

abstract class RemoteControlBridge(private val machine: TheMachineInterface): TheMachineInterface {
    override fun turnOn() {
        machine.turnOn()
    }

    override fun turnOff() {
        machine.turnOff()
    }

    override fun setChannel(channel: Int) {
        machine.setChannel(channel)
    }
}
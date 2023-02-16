package com.example.bridge_pattern

class NormalTVRemoteControlBridge(machineInterface: TheMachineInterface): RemoteControlBridge(machineInterface) {
    override fun turnOn() {
        println("Normal TV Remote Control: ")
        super.turnOn()
    }

    override fun turnOff() {
        println("Normal TV Remote Control: ")
        super.turnOff()
    }

    override fun setChannel(channel: Int) {
        println("Normal TV Remote Control: ")
        super.setChannel(channel)
    }
}
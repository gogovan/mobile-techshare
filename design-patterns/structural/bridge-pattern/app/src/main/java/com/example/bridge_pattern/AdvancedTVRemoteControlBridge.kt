package com.example.bridge_pattern

class AdvancedTVRemoteControlBridge(machineInterface: TheMachineInterface): RemoteControlBridge(machineInterface) {
    override fun turnOn() {
        println("Advanced TV Remote Control: ")
        super.turnOn()
    }

    override fun turnOff() {
        println("Advanced TV Remote Control: ")
        super.turnOff()
    }

    override fun setChannel(channel: Int) {
        println("Advanced TV Remote Control: ")
        super.setChannel(channel)
    }
}
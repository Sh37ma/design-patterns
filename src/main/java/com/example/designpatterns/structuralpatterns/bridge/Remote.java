package com.example.designpatterns.structuralpatterns.bridge;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Remote {
    protected Device device;

    void togglePower() {
        device.setEnabled(!device.isEnabled());
        System.out.println("Device status is: " + device.isEnabled());
    }

    void volumeUp(){
        var volume = device.getVolume();
        device.setVolume(++volume);
        System.out.println("Device volume is: " + device.getVolume());
    }

    void volumeDown(){
        var volume = device.getVolume();
        device.setVolume(--volume);
        System.out.println("Device volume is: " + device.getVolume());
    }

    void channelUp(){
        var channel = device.getChannel();
        device.setChannel(++channel);
        System.out.println("Device channel is: " + device.getChannel());
    }

    void channelDown(){
        var channel = device.getChannel();
        device.setChannel(--channel);
        System.out.println("Device channel is: " + device.getChannel());
    }
}

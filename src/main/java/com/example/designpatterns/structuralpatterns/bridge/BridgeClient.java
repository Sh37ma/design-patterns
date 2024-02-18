package com.example.designpatterns.structuralpatterns.bridge;

import com.example.designpatterns.Pattern;

public class BridgeClient implements Pattern {
    @Override
    public void triggerPattern() {
        Device tv = new TV(false, 10, 5);
        Remote remote = new Remote(tv);

        remote.togglePower();
        remote.channelUp();
        remote.volumeUp();
        remote.togglePower();

        Device radio = new Radio(false, 2, 20);
        remote = new Remote(radio);
        remote.togglePower();
        remote.channelUp();
        remote.volumeUp();
        remote.togglePower();
    }
}

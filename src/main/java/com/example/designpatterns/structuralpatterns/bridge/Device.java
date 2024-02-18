package com.example.designpatterns.structuralpatterns.bridge;

public interface Device {
    boolean isEnabled();
    void setEnabled(boolean enabled);
    int getVolume();
    void setVolume(int volume);
    int getChannel();
    void setChannel(int channel);
}

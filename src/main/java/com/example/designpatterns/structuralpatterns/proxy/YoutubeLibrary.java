package com.example.designpatterns.structuralpatterns.proxy;

import java.util.List;

public interface YoutubeLibrary {
    List<String> getVideoList();
    byte[] downloadVideo(String name);
}

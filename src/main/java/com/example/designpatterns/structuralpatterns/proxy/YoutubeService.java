package com.example.designpatterns.structuralpatterns.proxy;

import java.util.List;
import java.util.Map;

public class YoutubeService implements YoutubeLibrary{
    private Map<String, byte[]> videos = Map.of("Shrek", new byte[4],
            "Venom", new byte[8],
            "LOTR", new byte[16]);
    @Override
    public List<String> getVideoList() {
        return videos.keySet().stream().toList();
    }

    @Override
    public byte[] downloadVideo(String name) {
        return videos.get(name);
    }
}

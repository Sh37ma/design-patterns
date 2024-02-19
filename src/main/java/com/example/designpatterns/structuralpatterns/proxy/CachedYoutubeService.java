package com.example.designpatterns.structuralpatterns.proxy;

import java.util.*;

public class CachedYoutubeService implements YoutubeLibrary {

    private final YoutubeService service;
    private final Map<String, byte[]> videos = new HashMap<>();
    private List<String> videoList = new ArrayList<>();

    public CachedYoutubeService(YoutubeService service) {
        this.service = service;
    }

    @Override
    public List<String> getVideoList() {
        if (videoList.isEmpty()) {
            videoList = service.getVideoList();
            System.out.println("Getting video list from original service");
        } else {
            System.out.println("Getting video list from cache");
        }
        System.out.println(videoList);
        return videoList;
    }

    @Override
    public byte[] downloadVideo(String name) {
        System.out.println("\nDownloading movie: " + name);
        if (videos.get(name) == null) {
            videos.clear();
            videos.put(name, service.downloadVideo(name));
            System.out.println("Getting video data from original service");
        } else {
            System.out.println("Getting video data from cache");
        }
        System.out.println(Arrays.toString(videos.get(name)));
        return videos.get(name);
    }

    public void reset() {
        System.out.println("\n /||| Cleaning cache |||\\");
        videos.clear();
        videoList = new ArrayList<>();
    }
}

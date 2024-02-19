package com.example.designpatterns.structuralpatterns.proxy;

import com.example.designpatterns.Pattern;

import java.util.List;

public class ProxyClient implements Pattern {
    @Override
    public void triggerPattern() {
        YoutubeService service = new YoutubeService();
        CachedYoutubeService cachedYoutubeService = new CachedYoutubeService(service);

        List<String> movies = cachedYoutubeService.getVideoList();
        cachedYoutubeService.downloadVideo(movies.get(0));
        cachedYoutubeService.downloadVideo(movies.get(1));
        cachedYoutubeService.downloadVideo(movies.get(1));

        cachedYoutubeService.reset();
        cachedYoutubeService.downloadVideo(movies.get(0));
        cachedYoutubeService.downloadVideo(movies.get(1));
    }
}

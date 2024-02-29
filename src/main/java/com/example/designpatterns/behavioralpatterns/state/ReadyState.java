package com.example.designpatterns.behavioralpatterns.state;

public class ReadyState extends State {
    public ReadyState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In ready state");
    }

    @Override
    void clickLock() {
        audioPlayer.changeState(new LockState(audioPlayer));
    }

    @Override
    void clickPlay() {
        audioPlayer.changeState(new PlayingState(audioPlayer));
    }

    @Override
    void clickNext() {
        audioPlayer.nextSong();
        audioPlayer.changeState(new PlayingState(audioPlayer));
    }
}

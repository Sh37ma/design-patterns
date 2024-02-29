package com.example.designpatterns.behavioralpatterns.state;

public class PlayingState extends State{
    public PlayingState(AudioPlayer audioPlayer) {
        super(audioPlayer);
        System.out.println("In playing state");
    }

    @Override
    void clickLock() {
        audioPlayer.changeState(new LockState(audioPlayer));
    }

    @Override
    void clickPlay() {
        audioPlayer.changeState(new ReadyState(audioPlayer));
    }

    @Override
    void clickNext() {
        audioPlayer.nextSong();
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        Playable hello = new MusicPlayer();
        Playable catchMeIfYouCan = new VideoPlayer();
        MediaController playSongAndVideo = new MediaController();

        playSongAndVideo.playMedia(hello);
        playSongAndVideo.playMedia(catchMeIfYouCan);
    }
}
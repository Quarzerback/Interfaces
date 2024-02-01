package org.example;

public class Main {
    public static void main(String[] args) {

        MusicPlayer hello = new MusicPlayer();
        VideoPlayer catchMeIfYouCan = new VideoPlayer();
        MediaController playSongAndVideo = new MediaController();

        playSongAndVideo.playMedia(hello);
        playSongAndVideo.playMedia(catchMeIfYouCan);
    }
}
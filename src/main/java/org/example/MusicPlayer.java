package org.example;

import org.example.Playable;

public class MusicPlayer implements Playable {
    @Override
    public void play() {
        System.out.println("Playing a song.");
    }
}

package org.example.crapsgame.model;

public interface MusicPlayer {
    default void next() {
        System.out.println("Next song");
    }
}

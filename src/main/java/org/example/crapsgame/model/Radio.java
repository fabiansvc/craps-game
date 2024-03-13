package org.example.crapsgame.model;

public interface Radio {
    void playRadio();
    void stopRadio();

    default void next() {
        System.out.println("Next Radio's station");
    }
}



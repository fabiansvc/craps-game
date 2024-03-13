package org.example.crapsgame.model;

public class Smartphone implements GPS, Radio, MusicPlayer {

    public void next() {
        MusicPlayer.super.next();
    }

    @Override
    public void getCoordinates() {

    }

    @Override
    public void playRadio() {

    }

    @Override
    public void stopRadio() {

    }


}

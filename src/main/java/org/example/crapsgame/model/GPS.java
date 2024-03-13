package org.example.crapsgame.model;

public interface GPS {
    void getCoordinates();

    default void getApproximateCoordinates() {
        System.out.println("Getting approximate coordinates via wifi and GSM...");
    }
}

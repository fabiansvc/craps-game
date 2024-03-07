package org.example.crapsgame.model;

public interface Animal {
    // Method signatures
    void makeSound();

    // Field (constant)
    String TYPE = "Animal";

    // Default method
    default void sleep() {
        System.out.println("The animal is sleeping");
    }
}

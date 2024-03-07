package org.example.crapsgame.model;

public class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks: Woof woof");
    }
}

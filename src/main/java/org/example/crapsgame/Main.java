package org.example.crapsgame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.example.crapsgame.controller.GameController;

import java.io.IOException;

public class Main extends Application  {

    public static void main(String[] args) {
        launch(args);
        // Create an instance of Dog
        //Dog myDog = new Dog();

        // Call the makeSound method
        //myDog.makeSound(); // Output: The dog barks: Woof woof

        // Access the TYPE field of the interface
        //System.out.println("Animal type: " + Animal.TYPE); // Output: Animal type: Animal

        // Call the default sleep method
        //myDog.sleep(); // Output: The animal is sleeping
        //CustomMouseListener customMouseListener = new CustomMouseListener();

        //customMouseListener.mouseClicked();
        //customMouseListener.mousePressed();

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/game-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Juego Graps");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

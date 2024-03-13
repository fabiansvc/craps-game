package org.example.crapsgame;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.example.crapsgame.controller.GameController;
import org.example.crapsgame.model.Smartphone;

import java.io.IOException;

public class Main extends Application  {

    public interface Player {
        public void start();
        public void pause();
        public void stop();
    }

    public interface MusicPlayer extends Player {
        default public void next() {
            System.out.println("Next from MusicPlayer");
        }
    }

    public class SmartPhone implements MusicPlayer {
        public void start() {
            System.out.println("start");
        }
        public void stop() {
            System.out.println("stop");
        }
        public void pause() {
            System.out.println("pause");
        }
    }

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
        //Smartphone htc = new Smartphone();
        //htc.next();


    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Button button = new Button("Haz clic aquí");

        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("Click");
            }
        });


        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/game-view.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Juego Graps");
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.crapsgame.model.Dice;
import org.example.crapsgame.model.Player;

public class GameController {

    @FXML
    private AnchorPane anchorPane;

    private Player player;
    private ImageView dice1, dice2;

    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        if (dice1 != null && dice2 != null) {
            anchorPane.getChildren().remove(dice1);
            anchorPane.getChildren().remove(dice2);
        }

        dice1 = new Dice().getDiceImage();
        dice1.setX(96);
        dice1.setY(96);

        dice2 = new Dice().getDiceImage();
        dice2.setX(288);
        dice2.setY(96);

        anchorPane.getChildren().add(dice1);
        anchorPane.getChildren().add(dice2);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

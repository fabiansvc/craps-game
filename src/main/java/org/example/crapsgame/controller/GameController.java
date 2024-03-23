package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import org.example.crapsgame.model.Dice;
import org.example.crapsgame.model.Player;

public class GameController {

    @FXML
    private AnchorPane anchorPane;
    @FXML
    private Label pointLabel, shotLabel;
    @FXML
    private TextArea resultTextArea;

    private Player player;
    private Dice dice1, dice2;
    private ImageView diceImageView1, diceImageView2;

    @FXML
    public void onHandleButtonRollTheDice(ActionEvent event) {
        if (diceImageView1 != null && diceImageView2 != null) {
            anchorPane.getChildren().remove(diceImageView1);
            anchorPane.getChildren().remove(diceImageView2);
        }

        dice1 = new Dice();
        dice2 = new Dice();

        diceImageView1 = dice1.getDiceImage();
        diceImageView1.setX(76);
        diceImageView1.setY(50);

        diceImageView2 = dice2.getDiceImage();
        diceImageView2.setX(170);
        diceImageView2.setY(50);

        anchorPane.getChildren().addAll(diceImageView1, diceImageView2);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

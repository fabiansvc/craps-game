package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import org.example.crapsgame.view.alert.AlertBox;
import org.example.crapsgame.model.player.Player;

public class GameController {
    private Player player;

    @FXML
    void onHandleButtonRollTheDice(ActionEvent event) {
        String title = "Información del juego de craps";
        String header = "Bienvenido";
        String content = "Bienvenido " + player.getNickname() + " en este juego podras jugar a...";
        new AlertBox().showMessage(title, header, content);
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}

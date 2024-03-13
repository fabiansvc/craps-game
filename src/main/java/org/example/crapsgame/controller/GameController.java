package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class GameController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        String nickname = nicknameTextField.getText();
        System.out.println(nickname);
    }

}

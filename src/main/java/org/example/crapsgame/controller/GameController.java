package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class GameController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    private TextArea welcomeTextArea;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        String nickname = nicknameTextField.getText();
        welcomeTextArea.setText("Bievenido " + nickname);
    }
}

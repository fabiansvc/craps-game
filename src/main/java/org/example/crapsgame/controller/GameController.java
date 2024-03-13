package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class GameController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    private TextArea welcomeTextArea;

    @FXML
    public void onHandleButtonPlay(ActionEvent event){
        System.out.println(event.getSource());
        System.out.println(event.getTarget());
        System.out.println(event.getEventType());


        String nickname = nicknameTextField.getText();
        welcomeTextArea.setText("Bievenido " + nickname);
    }

    @FXML
    public void onHandleKeyTextField(KeyEvent event) {
        System.out.println(event.getText());
    }


}

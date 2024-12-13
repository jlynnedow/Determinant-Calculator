package com.example.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;

import java.io.IOException;

public class OpenerController {
    @FXML
    private Label b1;

    @FXML
    private Label b2;

    @FXML
    private Label b3;


    public void openp2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("two.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("2x2 matrix");
        stage.show();
    }

    public void openp3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("three.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("3x3 matrix");
        stage.show();
    }
}
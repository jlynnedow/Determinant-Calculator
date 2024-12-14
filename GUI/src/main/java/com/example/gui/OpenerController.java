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

    /**
     * Opens the scene for the 2x2 matrix calculator
     */
    public void openp2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Two.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("2x2 matrix");
        stage.show();
    }

    /**
     * Opens the scene for the 3x3 matrix calculator
     */
    public void openp3(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Three.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("2x2 matrix");
        stage.show();
    }

    /**
     * Opens the scene for the 4x4 matrix calculator
     */
    public void openp4(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Four.fxml"));
        Stage stage = new Stage();
        stage.setScene(new Scene(loader.load()));
        stage.setTitle("2x2 matrix");
        stage.show();
    }
}
package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class ThreeController {

    @FXML
    private Label c1;
    @FXML
    private TextField a;
    @FXML
    private TextField b;
    @FXML
    private TextField c;
    @FXML
    private TextField d;
    @FXML
    private TextField e;
    @FXML
    private TextField f;
    @FXML
    private TextField g;
    @FXML
    private TextField h;
    @FXML
    private TextField i;
    @FXML
    private Label ans;

    public void closeScene2() {
        // Get the current stage
        Stage stage = (Stage) c1.getScene().getWindow();
        // Close the current stage
        stage.close();
    }

    /**
     * Computes the determinant and makes the answer visible
     */
    @FXML
    public void onEnter(){
        double[][] mat = new double[3][3];
        mat[0][0] = Double.parseDouble(a.getText());
        mat[0][1] = Double.parseDouble(b.getText());
        mat[0][2] = Double.parseDouble(c.getText());
        mat[1][0] = Double.parseDouble(d.getText());
        mat[1][1] = Double.parseDouble(e.getText());
        mat[1][2] = Double.parseDouble(f.getText());
        mat[2][0] = Double.parseDouble(g.getText());
        mat[2][1] = Double.parseDouble(h.getText());
        mat[2][2] = Double.parseDouble(i.getText());
        double det = Matrix.det(mat);
        ans.setText("Answer: " + det);
        ans.setFont(Font.font("Montserrat"));
        ans.setVisible(true);
    }
}

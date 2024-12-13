package com.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class FourController {

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
    private TextField j;
    @FXML
    private TextField k;
    @FXML
    private TextField l;
    @FXML
    private TextField m;
    @FXML
    private TextField n;
    @FXML
    private TextField o;
    @FXML
    private TextField p;
    @FXML
    private Label ans;

    public void closeScene2() {
        // Get the current stage
        Stage stage = (Stage) c1.getScene().getWindow();
        // Close the current stage
        stage.close();
    }

    @FXML
    public void onEnter(){
        double[][] mat = new double[4][4];
        mat[0][0] = Double.parseDouble(a.getText());
        mat[0][1] = Double.parseDouble(b.getText());
        mat[0][2] = Double.parseDouble(c.getText());
        mat[0][3] = Double.parseDouble(d.getText());
        mat[1][0] = Double.parseDouble(e.getText());
        mat[1][1] = Double.parseDouble(f.getText());
        mat[1][2] = Double.parseDouble(g.getText());
        mat[1][3] = Double.parseDouble(h.getText());
        mat[2][0] = Double.parseDouble(i.getText());
        mat[2][1] = Double.parseDouble(j.getText());
        mat[2][2] = Double.parseDouble(k.getText());
        mat[2][3] = Double.parseDouble(l.getText());
        mat[3][0] = Double.parseDouble(m.getText());
        mat[3][1] = Double.parseDouble(n.getText());
        mat[3][2] = Double.parseDouble(o.getText());
        mat[3][3] = Double.parseDouble(p.getText());
        double det = Matrix.det(mat);
        ans.setText("Answer: " + det);
        ans.setFont(Font.font("Montserrat"));
        ans.setVisible(true);
    }
}

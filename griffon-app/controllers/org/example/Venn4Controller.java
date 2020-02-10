package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class Venn4Controller {

    @FXML
    private Button twoSets;
    @FXML
    private Button threeSets;
    @FXML
    private Button fourSets;
    @FXML
    private Button fiveSets;
    @FXML
    private Button clear;
    @FXML
    private Button sixSets;
    @FXML
    private AnchorPane rootpane;

    @FXML
    private void Two(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennTwo.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void Three(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennThree.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void Four(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennFour.fxml"));
        rootpane.getChildren().setAll(pane);

    }

    @FXML
    private void Five(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennFive.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    @FXML
    private void Six(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennSix.fxml"));
        rootpane.getChildren().setAll(pane);
    }

    @FXML
    private void Clear(MouseEvent event) throws IOException {
        AnchorPane pane = (AnchorPane) FXMLLoader.load(getClass().getResource("VennDefault.fxml"));
        rootpane.getChildren().setAll(pane);
    }
}

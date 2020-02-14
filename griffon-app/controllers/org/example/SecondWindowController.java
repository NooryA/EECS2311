package org.example;

import com.jfoenix.controls.JFXButton;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class  SecondWindowController {
	
	@FXML
    private AnchorPane createVenn;
	
	@FXML
    private JFXButton createButton;

	//Small "X" at top right that closes program
	@FXML
    private Text close;
	
	//Creates List for Number of Sets User Chooses
	ObservableList<String> numberOfSetsList = FXCollections.observableArrayList("Two", "Three");
	
	//ChoiceBox
	@FXML
	private ChoiceBox<String> numberOfSetsBox;
	
	//Initializes the Sets 
	@FXML
	private void initialize() {
		numberOfSetsBox.setValue("mm");
		numberOfSetsBox.setItems(numberOfSetsList);	
	}
	
	 @FXML
	    void create(ActionEvent event) {
		//opens new the third window
	    	try {

	    		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ThirdWindow.fxml"));
	    		Parent root2 = (Parent) fxmlLoader.load();
	    		Stage stage = new Stage();
	    		stage.setScene(new Scene(root2));
	    		stage.show();
	    	}
	    	catch(Exception e) {
	    		System.err.println(e.getMessage());
	    	}
	    }

	//Small "X" at top right that closes program
    @FXML
    void close(MouseEvent event) {
    	System.exit(0);
    }

}


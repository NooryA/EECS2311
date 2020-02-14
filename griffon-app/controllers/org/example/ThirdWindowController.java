package org.example;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;

public class ThirdWindowController implements Initializable {

	@FXML
	private JFXTextField titleInput;

	@FXML
	private JFXTextField setAInput;

	@FXML
	private JFXTextField setBInput;
	

    @FXML
    void close(MouseEvent event) {
    	//closes program
    	System.exit(0);
    }


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}

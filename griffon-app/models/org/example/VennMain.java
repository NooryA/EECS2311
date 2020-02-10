package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public  class VennMain extends Application {

        static AnchorPane root;
        
        //private static int current=0;
    @Override
    public void start(Stage primaryStage) throws Exception {
        // TODO Auto-generated method stub
        
            root =(AnchorPane)FXMLLoader.load(getClass().getResource("VennDefault.fxml"));
            
            
            Scene scene = new Scene(root, 900, 500);
            primaryStage.setTitle("VennApp");
            primaryStage.setScene(scene);
            primaryStage.show();
            
        
        
        
        }
    
        
    
    public static void main(String[] args) {
        launch(args);
    }
}




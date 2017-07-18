package controllers;



import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Main.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class InstructionsController extends MainApp implements Initializable{

		
	@FXML
	private Button mainMenuButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert mainMenuButton != null : "fx:id=\"mainMenuButton\"";
		mainMenuButton.setOnAction(e -> {
        	Parent mmp = null;
        	primaryStage = (Stage) mainMenuButton.getScene().getWindow();
    		try{
    			mmp = FXMLLoader.load(getClass().getResource(mainMenuLocation));
    		}
    		catch(IOException i){
    			System.out.println("YA DONE GOOFED");
    		}
    		mainMenu = new Scene(mmp);
    		
    		primaryStage.setScene(mainMenu);
    		primaryStage.show();
    		
        });
		
	}

}

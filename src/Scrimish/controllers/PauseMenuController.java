package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import Main.MainApp;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PauseMenuController extends MainApp implements Initializable{

		
	@FXML
	private Button resumeButton;
	@FXML
	private Button restartButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert resumeButton != null : "fx:id=\"resumeButton\"";
		assert restartButton != null : "fx:id=\"restartButton\"";
		restartButton.setText("Quit it Now");
		
		resumeButton.setOnAction(e -> {
			Parent rP = null;
			primaryStage = (Stage)resumeButton.getScene().getWindow();
			try {
	            rP = FXMLLoader.load(getClass().getResource(inGameSelectCards1));        	
	            selectCards = new Scene(rP);
	            primaryStage.setScene(selectCards);
	            primaryStage.show();
	        } 
	        catch (IOException e2) {
	            e2.printStackTrace();
	        }
		});
		
		restartButton.setOnAction(e -> {
			Platform.exit();
		});
	}

}
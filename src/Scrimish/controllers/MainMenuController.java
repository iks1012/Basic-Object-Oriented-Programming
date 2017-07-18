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


public class MainMenuController extends MainApp implements Initializable {
	
	@FXML
	private Button newGameButton;
	@FXML
	private Button creditsButton;
	@FXML
	private Button instructionsButton;
	@FXML
	private Button exitGameButton;
	@FXML
	private Button mainMenuButton;
	
    @Override
    public void initialize(URL fxmlFileLocation, ResourceBundle resources){
        
    	
    	
    	assert newGameButton != null : "fx:id=\"newGameButton\"";
    	assert instructionsButton != null : "fx:id=\"instructionsButton\"";
    	assert mainMenuButton != null : "fx:id=\"mainMenuButton\"";
    	assert creditsButton != null : "fx:id=\"creditsButton\"";
       
        newGameButton.setOnAction(e -> {
        	Parent ngP = null;
        	primaryStage = (Stage) newGameButton.getScene().getWindow();
    		try{
    			ngP = FXMLLoader.load(getClass().getResource(newGameLocation));
    		}
    		catch(IOException i){
    			System.out.println("YA DONE GOOFED");
    		}
    		newGame = new Scene(ngP);
    		primaryStage.setScene(newGame);
    		primaryStage.show();
        });
        
        
        
        instructionsButton.setOnAction(e ->{
        	Parent iP = null;
        	primaryStage = (Stage) instructionsButton.getScene().getWindow();
    		try{
    			iP = FXMLLoader.load(getClass().getResource(instructionsLocation));
    		}
    		catch(IOException i){
    			System.out.println("YA DONE GOOFED");
    		}
    		instructions = new Scene(iP);
    		primaryStage.setScene(instructions);
    		primaryStage.show();
        });
        
        creditsButton.setOnAction(e -> {
        	Parent cP = null;
        	primaryStage = (Stage) instructionsButton.getScene().getWindow();
    		try{
    			cP = FXMLLoader.load(getClass().getResource(creditsLocation));
    		}
    		catch(IOException i){
    			System.out.println("YA DONE GOOFED");
    		}
    		credits = new Scene(cP);
    		primaryStage.setScene(credits);
    		primaryStage.show();
        });
        
        
        
        exitGameButton.setOnAction(e -> Platform.exit());
    }

}
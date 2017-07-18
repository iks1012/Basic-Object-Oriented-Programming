package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import Main.MainApp;
import gameLogic.Variables;
import gameStuff.Decks;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class NewGameController extends MainApp implements Initializable {
	private char[] card2 = {'1','1','1','1','1','2','2','2','2','2','3','3','3','4','4','4','5','5','6','6','A','A','S','S'};
	public char[][] cpuDeck2 = new char[5][5];
	public char[][] pDeck2 = new char[5][5];
	
	@FXML
	private Button mainMenuButton;
	
	@FXML
	private Button exitGameButton;
	
	@FXML
	private Button PvEButton;
	
	@FXML
	private Button setDifficultyButton;
	

	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		assert PvEButton != null : "fx:id=\"PvEButton\"";
		assert setDifficultyButton != null : "fx:id\"setDifficultyButton\"";
		assert mainMenuButton != null : "fx:id=\"mainMenuButton\"";
		
		PvEButton.setOnAction(e -> {
        	//decks.setDecks();
        	Parent setCards = null;
        	primaryStage = (Stage) PvEButton.getScene().getWindow();
    		try{
    			setCards = FXMLLoader.load(getClass().getResource(inGameSelectCards1));
    			selectCards = new Scene(setCards);
        		primaryStage.setScene(selectCards);
        		primaryStage.show(); 
    		}
    		catch(Exception i){
    			System.out.println("YA DONE GOOFED");
    		}
    		       	
		});
		
		setDifficultyButton.setOnAction(e -> {
			storeAllCards();
			
			
			
			
			
			
			
			Parent setCards = null;
        	primaryStage = (Stage) setDifficultyButton.getScene().getWindow();
    		try{
    			setCards = FXMLLoader.load(getClass().getResource(inGameLocation));
    			inGame = new Scene(setCards);
        		primaryStage.setScene(inGame);
        		primaryStage.show();
    		}
    		catch(Exception i){
    			System.out.println("YA DONE GOOFED - asdf");
    		}
		});
		
		mainMenuButton.setOnAction(e -> {
			all.setPlaying(false);
			System.out.println("Playing = " + all.isPlaying());
        	Parent ngP = null;
        	primaryStage = (Stage) mainMenuButton.getScene().getWindow();
    		try{
    			ngP = FXMLLoader.load(getClass().getResource(mainMenuLocation));
    		}
    		catch(IOException i){
    			System.out.println("YA DONE GOOFED");
    		}
    		mainMenu = new Scene(ngP);
    		
    		primaryStage.setScene(mainMenu);
    		primaryStage.show();
    		
        });

        exitGameButton.setOnAction(e -> Platform.exit());
	}
	public void storeAllCards(){
		File f = new File("Chars2.txt");
		if(!f.exists()){
			try(PrintWriter out = new PrintWriter(f);){
				setPCards();
				for(int d = 0; d < 5 ; d++){
					for(int c = 0; c < 5; c++){
						out.println((int)pDeck2[d][c]);
					}
					out.println("");
					
				}
				setCCards();
				for(int d = 0; d < 5 ; d++){
					for(int c = 0; c < 5; c++){
						out.println((int)cpuDeck2[d][c]);
					}
					out.println("");
				}
				out.flush();
				out.close();
			}
			catch(FileNotFoundException i){
				
			}
		}
		
	}
	public void shuffleCards(){
		for (int i = 0; i < card2.length; i++) {
			 // Generate an index j randomly
			 int j = (int)(Math.random() * card2.length);
			 // Swap myList[i] with myList[j]
			 char temp = card2[i];
			 card2[i] = card2[j];
			 card2[j] = temp;
			 //System.out.print(card2[i]);
		}
		//System.out.println();
	}
	public void setPCards(){
		int now = 0;
		shuffleCards();
		Random r = new Random();
		int randomDeck = r.nextInt(5);
		pDeck2[randomDeck][4] = 'C';
		int c = 0;
		for(int i = 1; i < 6; i++){
			for(int j = 1; j < 6; j++){
				if(((i-1) == randomDeck) && j == 5){
					now++;
				}
				else{
					pDeck2[i-1][j-1] = card2[c];
					c++;
					
				}		
			}
		}
	}
	public void setCCards(){
		int now = 0;
		shuffleCards();
		Random r = new Random();
		int randomDeck = r.nextInt(5);
		cpuDeck2[randomDeck][4] = 'C';
		int c = 0;
		for(int i = 1; i < 6; i++){
			for(int j = 1; j < 6; j++){
				if(((i-1) == randomDeck) && j == 5){
					now++;
				}
				else{
					cpuDeck2[i-1][j-1] = card2[c];
					c++;
				}		
			}
		}
	}
}

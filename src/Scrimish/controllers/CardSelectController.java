package controllers;



import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.concurrent.ThreadLocalRandom;

import Main.CardsNotSelected;
import Main.MainApp;
import gameStuff.Card;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class CardSelectController extends MainApp implements Initializable{
	private char[] card2 = {'1','1','1','1','1','2','2','2','2','2','3','3','3','4','4','4','5','5','6','6','A','A','S','S'};
	public char[][] cpuDeck2 = new char[5][5];
	
	
	@FXML
	private Button oneButton;
	@FXML
	private Button twoButton;
	@FXML
	private Button threeButton;
	@FXML
	private Button fourButton;
	@FXML
	private Button fiveButton;
	@FXML
	private Button sixButton;
	@FXML
	private Button AButton;
	@FXML
	private Button SButton;
	@FXML
	private Button CButton;
	@FXML
	private Button previousButton;
	@FXML
	private Button nextButton;
	@FXML
	private Button startButton;
	@FXML
	private Button pauseButton;
	@FXML
	private Button firstCard;
	@FXML
	private Button secondCard;
	@FXML
	private Button thirdCard;
	@FXML
	private Button fourthCard;
	@FXML
	private Button fifthCard;
	
	@FXML
	private Label cardSelectHeader;
	
	private Button selectPressed;
	private int deck = 0;
	private int card;
	private String set;
	private String whiteSpace = "                                 ";//33 spaces
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		assert oneButton != null      : "fx:id=\"oneButton\"";       // accounted for 
		assert twoButton != null      : "fx:id=\"twoButton\"";       // accounted for 
		assert threeButton != null    : "fx:id=\"threeButton\"";     // accounted for 
		assert fourButton != null     : "fx:id=\"fourButton\"";      // accounted for 
		assert fiveButton != null     : "fx:id=\"fiveButton\"";      // accounted for 
		assert sixButton != null      : "fx:id=\"sixButton\"";       // accounted for 
		assert AButton != null        : "fx:id=\"AButton\"";         // accounted for 
		assert SButton != null        : "fx:id=\"SButton\"";         // accounted for 
		assert CButton != null        : "fx:id=\"CButton\"";         // accounted for 
		assert previousButton != null : "fx:id=\"previousButton\"";  // accounted for 
		assert nextButton != null     : "fx:id=\"nextButton\"";      // accounted for    
		assert pauseButton != null    : "fx:id=\"pauseButton\"";      
		assert startButton != null    : "fx:id=\"startButton\"";
		assert firstCard != null      : "fx:id=\"firstCard\"";       // accounted for 
		assert secondCard != null     : "fx:id=\"secondCard\"";      // accounted for    
		assert thirdCard != null      : "fx:id=\"thirdCard\"";       // accounted for 
		assert fourthCard != null     : "fx:id=\"fourthCard\"";      // accounted for 
		assert fifthCard != null      : "fx:id=\"fifthCard\"";       // accounted for 

    	cardsVisibility(false);
    	pauseButton.setVisible(false);
    	
    	
    	
		firstCard.setOnAction(e -> {
			card = 0;
			selectPressed = firstCard;
			if(restockCard(firstCard)){
				updateCards();
			}
			choicesVisibility(false);
			cardsVisibility(true);
		});
		
		secondCard.setOnAction(e -> {
			card = 1;
			selectPressed = secondCard;
			if(restockCard(secondCard)){
				updateCards();
			}
			choicesVisibility(false);
			cardsVisibility(true);
		});
		
		thirdCard.setOnAction(e -> {
			card = 2;
			selectPressed = thirdCard;
			if(restockCard(thirdCard)){
				updateCards();
			}
			choicesVisibility(false);
			cardsVisibility(true);
		});
		
		fourthCard.setOnAction(e -> {
			card = 3;
			selectPressed = fourthCard;
			if(restockCard(fourthCard)){
				updateCards();
			}
			choicesVisibility(false);
			cardsVisibility(true);
		});
		
		fifthCard.setOnAction(e -> {
			card = 4;
			selectPressed = fifthCard;
			if(restockCard(fifthCard)){
				updateCards();
			}
			choicesVisibility(false);
			cardsVisibility(true);
		});
		
		oneButton.setOnAction(e -> {
			onesRemaining --;
			selectCard('1');
			oneButton.setText("'1' - "+ onesRemaining + " Left");
	    	selectPressed.setText("Dagger Card - '1'");
        });
		
		twoButton.setOnAction(e -> {
			twosRemaining--;
			selectCard('2');
			twoButton.setText("'2' - "+ twosRemaining + " Left");
	    	selectPressed.setText("Sword Card - '2'");
        });
		
		threeButton.setOnAction(e -> {
			threesRemaining--;
			selectCard('3');
			threeButton.setText("'3' - "+ threesRemaining + " Left");
	    	selectPressed.setText("Morning Star Card - '3'");
        });
		
		fourButton.setOnAction(e -> {
			foursRemaining--;
			selectCard('4');
			fourButton.setText("'4' - "+ foursRemaining + " Left");
	    	selectPressed.setText("War Axe Card - '4'");
        });
		
		fiveButton.setOnAction(e -> {
			fivesRemaining--;
			selectCard('5');
			fiveButton.setText("'5' - "+ fivesRemaining + " Left");
	    	selectPressed.setText("Halberd Card - '5'");
        });
		
		sixButton.setOnAction(e -> {
			sixRemaining--;
			selectCard('6');
			sixButton.setText("'6' - "+ sixRemaining + " Left");
	    	selectPressed.setText("Longsword Card - '6'");
        });
		
		AButton.setOnAction(e -> {
			archersRemaining--;
			selectCard('A');
			AButton.setText("'A' - "+ archersRemaining + " Left");
	    	selectPressed.setText("Archer Card - 'A'");
        });
		
		SButton.setOnAction(e -> {
			shieldsRemaining--;
			selectCard('S');
			SButton.setText("'S' - "+ shieldsRemaining + " Left");
	    	selectPressed.setText("Sheild Card - 'S'");
        });
		
		CButton.setOnAction(e -> {
			crownsRemaining--;
			selectCard('C');
			CButton.setText("'C' - "+ shieldsRemaining + " Left");
	    	selectPressed.setText("Crown Card - 'C'");
        });
		
		nextButton.setOnAction(e -> {
			nextDeck();
		});
		
		previousButton.setOnAction(e -> {
			prevDeck();
		});
		
		pauseButton.setOnAction(e -> {
			Parent pmP = null;
			primaryStage = (Stage)pauseButton.getScene().getWindow();
			try {
	            pmP = FXMLLoader.load(getClass().getResource(pauseMenuLocation));        	
	            pauseMenu = new Scene(pmP);
	            primaryStage.setScene(pauseMenu);
	            primaryStage.show();
	        } 
	        catch (IOException e2) {
	            e2.printStackTrace();
	        }
		});
		
		startButton.setOnAction(e -> {
			boolean allSelected = true;
			for(int d = 0; d <5; d++){
				for(int c = 0; c < 5; c++){
					if(decks.getPlayerChar(d, c) != '0'){
						allSelected &= true;
					}
					else{
						allSelected &= false;
					}
				}
			}
			
			if(allSelected){
				//Start Game
				
				//Store Variables
				storeAllCards();
				
				//Switch to the game screen
				Parent igP = null;
	        	primaryStage = (Stage) startButton.getScene().getWindow();
	    		try{
	    			igP = FXMLLoader.load(getClass().getResource(inGameLocation));
	    			inGame = new Scene(igP);
		    		primaryStage.setScene(inGame);
		    		primaryStage.show();
	    		}
	    		catch(IOException i){
	    			System.out.println("YA DONE GOOFED");
	    		}
	    		
			}
			else{
				CardsNotSelected.display("ERROR","Complete Selecting Cards - Some are incomplete");
			}
		});
	}
	
	public void storeAllCards(){
		File f = new File("Chars2.txt");
		if(!f.exists()){
			try(PrintWriter out = new PrintWriter(f);){
				for(int d = 0; d < 5 ; d++){
					for(int c = 0; c < 5; c++){
						out.println((int)decks.p1Deck[d][c].getType());
					}
					out.println("");
					
				}
				setCards();
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
		}
	}
	public void setCards(){
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
	public void updateCards(){
		oneButton.setText("'1' - "+ onesRemaining + " Left");
		twoButton.setText("'2' - "+ twosRemaining + " Left");
		threeButton.setText("'3' - "+ threesRemaining + " Left");
		fourButton.setText("'4' - "+ foursRemaining + " Left");
		fiveButton.setText("'5' - "+ fivesRemaining + " Left");
		sixButton.setText("'6' - "+ sixRemaining + " Left");
		AButton.setText("'A' - "+ archersRemaining + " Left");
		SButton.setText("'S' - "+ shieldsRemaining + " Left");
		CButton.setText("'C' - "+ shieldsRemaining + " Left");
		
	}
	public boolean restockCard(Button sel){
		char test = sel.getText().charAt(sel.getText().length()-2);
		if(test == '1'){
			onesRemaining++;
			setpCard(deck, card, '0');
			System.out.println(decks.getPlayerChar(deck, card));
			return true;
		}
		else if(test == '2'){
			twosRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == '3'){
			threesRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == '4'){
			foursRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == '5'){
			fivesRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == '6'){
			sixRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == 'A'){
			archersRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == 'S'){
			shieldsRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else if(test == 'C'){
			crownsRemaining++;
			setpCard(deck, card, '0');
			return true;
		}
		else{
			return false;
		}
	}
	public void prevDeck(){
		if(deck >= 1 && deck <= 4){
			deck--;
			loadDeck();
			cardSelectHeader.setText(" Card Layout and Selection"+whiteSpace+"Deck number "+(deck+1));
			
		}
		else{
			
		}
	}
	public void nextDeck(){
		if(deck>=0 && deck<=3){
			deck++;
			loadDeck();
			cardSelectHeader.setText(" Card Layout and Selection"+whiteSpace+"Deck number "+(deck+1));
			
		}
		else{
			//Start the actual attacking process
		}
	}
	public void loadDeck(){
		loadCard(0);
		firstCard.setText(set);
		
		loadCard(1);
		secondCard.setText(set);
		
		loadCard(2);
		thirdCard.setText(set);
		
		loadCard(3);
		fourthCard.setText(set);
		
		loadCard(4);
		fifthCard.setText(set);
	}
	public void loadCard(int i){
		char test = decks.getPlayerChar(deck, i);
		set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger Card - ") : ((test == '2')? ("Sword Card - ") : ((test == '3')? ("Morning Star Card - ") : ((test == '4')? ("War Axe Card - ") : ((test == '5')? ("Halberd Card - ") : ((test == '6')? ("Longsword Card - ") : ((test == 'A')? ("Archer Card - ") : ((test == 'S')? ("Shield Card - "): ((test == 'C')? ("Crown Card - "): ""))))))))) + "'"+test+"'");
		
	}
	public void setpCard(int d, int c, char t){
		decks.setPlayerChar((d), (c), t);
		System.out.println(t);
	}
	public void cardsVisibility(boolean vis){
		if(onesRemaining > 0 && vis){
			oneButton.setVisible(vis);
		}
		else if (!vis){

			oneButton.setVisible(vis);
		}
		
		if(twosRemaining > 0 && vis){
			twoButton.setVisible(vis);
		}
		else if (!vis){

			twoButton.setVisible(vis);
		}
		
		if(threesRemaining > 0 && vis){
			threeButton.setVisible(vis);
		}
		else if (!vis){

			threeButton.setVisible(vis);
		}
		
		if(foursRemaining > 0 && vis){
			fourButton.setVisible(vis);
		}
		else if (!vis){

			fourButton.setVisible(vis);
		}
		
		if(fivesRemaining > 0 && vis){
			fiveButton.setVisible(vis);
		}
		else if (!vis){

			fiveButton.setVisible(vis);
		}
		
		if(sixRemaining > 0 && vis){
			sixButton.setVisible(vis);
		}
		else if (!vis){
			sixButton.setVisible(vis);
		}
		
		if(archersRemaining > 0 && vis){
			AButton.setVisible(vis);
		}
		else if (!vis){
			AButton.setVisible(vis);
		}
		
		if(shieldsRemaining > 0 && vis){
			SButton.setVisible(vis);
		}
		else if (!vis){
			SButton.setVisible(vis);
		}
		
		if(card == 4 && crownsRemaining > 0 && vis){
			CButton.setVisible(vis);
		}
		else if (!vis){
			CButton.setVisible(vis);
		}
		
	}
	public void selectCard(char t){
    	cardsVisibility(false);
    	choicesVisibility(true);
    	setpCard(deck, card, t);
	}
	public void choicesVisibility(boolean vis){
		firstCard.setVisible(vis);
		secondCard.setVisible(vis);
		thirdCard.setVisible(vis);
		fourthCard.setVisible(vis);
		fifthCard.setVisible(vis);
		previousButton.setVisible(vis);
		nextButton.setVisible(vis);
		startButton.setVisible(vis);
	}

}

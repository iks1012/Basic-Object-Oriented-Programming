package controllers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;



import Main.MainApp;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class InGameController extends MainApp implements Initializable{
	
	
	@FXML
	private ImageView PCardIMG;
	@FXML
	private ImageView CPUCardIMG;
	
	@FXML
	private TextArea AttackLog;
	
	@FXML
	private Button pD0Top;
	@FXML
	private Button pD1Top;
	@FXML
	private Button pD2Top;
	@FXML
	private Button pD3Top;
	@FXML
	private Button pD4Top;
	
	@FXML
	private Button cD0Top;
	@FXML
	private Button cD1Top;
	@FXML
	private Button cD2Top;
	@FXML
	private Button cD3Top;
	@FXML
	private Button cD4Top;
	
	@FXML
	private Label pD0C0;
	@FXML
	private Label pD0C1;
	@FXML
	private Label pD0C2;
	@FXML
	private Label pD0C3;
	@FXML
	private Label pD0C4;
	@FXML
	private Label pD1C0;
	@FXML
	private Label pD1C1;
	@FXML
	private Label pD1C2;
	@FXML
	private Label pD1C3;
	@FXML
	private Label pD1C4;
	@FXML
	private Label pD2C0;
	@FXML
	private Label pD2C1;
	@FXML
	private Label pD2C2;
	@FXML
	private Label pD2C3;
	@FXML
	private Label pD2C4;
	@FXML
	private Label pD3C0;
	@FXML
	private Label pD3C1;
	@FXML
	private Label pD3C2;
	@FXML
	private Label pD3C3;
	@FXML
	private Label pD3C4;
	@FXML
	private Label pD4C0;
	@FXML
	private Label pD4C1;
	@FXML
	private Label pD4C2;
	@FXML
	private Label pD4C3;
	@FXML
	private Label pD4C4;
	
	@FXML
	private Button attackButton;
	@FXML
	private Button discardButton;
	
	

	
	private String one    = "/Main/CardIMGs/1Dagger.jpg";
	private String two    = "/Main/CardIMGs/2Sword.jpg";
	private String three  = "/Main/CardIMGs/3MorningStar.jpg";
	private String four   = "/Main/CardIMGs/4WarAxe.jpg";
	private String five   = "/Main/CardIMGs/5Halberd.jpg";
	private String six    = "/Main/CardIMGs/6Longsword.jpg";
	private String archer = "/Main/CardIMGs/AArcher.jpg";
	private String shield = "/Main/CardIMGs/SSheild.jpg";
	private String crown  = "/Main/CardIMGs/CCrown.jpg";
	private String def    = "/Main/CardIMGs/asdf.jpg";
	private String blank  = "/Main/CardIMGs/blank.jpg";
	
	private Image oneImage     = new Image(one);
	private Image twoImage     = new Image(two);
	private Image threeImage   = new Image(three);
	private Image fourImage    = new Image(four);
	private Image fiveImage    = new Image(five);
	private Image sixImage     = new Image(six);
	private Image archerImage  = new Image(archer);
	private Image shieldImage  = new Image(shield);
	private Image crownImage   = new Image(crown);
	private Image defaultImage = new Image(def);
	private Image blankImage   = new Image(blank);
	
	
	private Random r = new Random();
	
	private int attackNumber = 0;
	private int pDeck;
	private int pCard;
	private int cDeck;
	private int cCard;
	private int pDDDD;
	private char pChar;
	private char cChar;
	private char attackChar;
	private boolean playerTurn;
	private boolean pSelected = false;
	private boolean cSelected = false;
	private boolean tempS = false;
	private char test;
	private String set;
	private String consoleText = "";
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		startGame();
		
		
		
		pD0Top.setOnAction(e -> {
			pDeck = 0;
			setSelections();
			setPCardAndPic();
		});
		
		pD1Top.setOnAction(e -> {
			pDeck = 1;
			setSelections();
			setPCardAndPic();
		});
		
		pD2Top.setOnAction(e -> {
			pDeck = 2;
			setSelections();
			setPCardAndPic();
		});
		
		pD3Top.setOnAction(e -> {
			pDeck = 3;
			setSelections();
			setPCardAndPic();
		});
		
		pD4Top.setOnAction(e -> {
			pDeck = 4;
			setSelections();
			setPCardAndPic();
		});
		
		cD0Top.setOnAction(e -> {
			cDeck = 0;
			setSelections();
			setCCardAndPic();
		});
		
		cD1Top.setOnAction(e -> {
			cDeck = 1;
			setSelections();
			setCCardAndPic();
		});
		
		cD2Top.setOnAction(e -> {
			cDeck = 2;
			setSelections();
			setCCardAndPic();
		});
		
		cD3Top.setOnAction(e -> {
			cDeck = 3;
			setSelections();
			setCCardAndPic();
		});
		
		cD4Top.setOnAction(e -> {
			cDeck = 4;
			setSelections();
			setCCardAndPic();
		});
		
		/*
		 * FOR THE ATTACK METHOD
		 * 'A' - A LIVES AND D LIVES
		 * 'B' - A LIVES AND D DIE S
		 * 'C' - A DIE S AND D LIVES
		 * 'D' - A DIE S AND D DIE S
		 */
		
		
		attackButton.setOnAction(e -> {
			playerAttackSequence();
			winner();
			playerTurn(false);
			showCards();
			resetImage();
			winner();
			cpuAttackSequence();
			winner();
			playerTurn(true);
			showCards();
			setSelections();
			
		});
		
		discardButton.setOnAction(e -> {
			setSelections();
			winner();
			discardAction(pDeck);
			winner();
			playerTurn(false);
			showCards();
			resetImage();
			winner();
			cpuAttackSequence();
			winner();
			playerTurn(true);
			showCards();
			setSelections();
		});
		
	}
	public void discardAction(int deck){
		int tempCard = topPCardNum(deck);
		decks.p1Deck[deck][tempCard].kill();
		attackNumber++;
		consoleText = "Attack Number "+attackNumber+": \n"+
				 	  "Player discards Deck: "+(deck+1)+"\n"+
				 	  "                Card: "+(tempCard+1)+"\n"+
				 	  "This was a "+ pChar +"\n \n";
		AttackLog.appendText(consoleText);
		AttackLog.setScrollTop(0);
		cSelected = false;
		pSelected = false;
		discardButton.setVisible(false);
	}
	public void discard(){
		if(pSelected && !cSelected && (pChar != 'C')){
			discardButton.setVisible(true);
		}
		else{
			discardButton.setVisible(false);
		}
	}
	public void winner(){
		try{
			if((playerTurn && cChar=='C') || (!playerTurn && cChar == 'C')){
				//Player won
				primaryStage = (Stage)attackButton.getScene().getWindow();
				try {
					Parent PW = FXMLLoader.load(getClass().getResource(PWinLocation));        	
		            PWin = new Scene(PW);
		            primaryStage.setScene(PWin);
		            primaryStage.show();
		        } 
		        catch (IOException e2) {
		            System.out.println("L not Taken");
		        }
			}
			else if ((!playerTurn && pChar == 'C') || (playerTurn && pChar == 'C')){
				//CPU Won
				primaryStage = (Stage)attackButton.getScene().getWindow();
				try {
					Parent CPUW = FXMLLoader.load(getClass().getResource(CPUWinLocation));        	
		            CPUWin = new Scene(CPUW);
		            primaryStage.setScene(CPUWin);
		            primaryStage.show();
		        } 
		        catch (IOException e2) {
		            System.out.println("L not Taken");
		        }
			}
			
		}
		catch(Exception e3){
			
		}
		
		
	}
	public void cpuAttackSequence(){
		pCard = -1;
		while(pCard == -1){
			pDeck = r.nextInt(5);
			pCard = topPCardNum(pDeck);
		}
		pChar = decks.p1Deck[pDeck][pCard].getType();
		
		cCard = -1;
		while(cCard == -1){
			cDeck = r.nextInt(5);
			cCard = topCCardNum(cDeck);
		}
		
		cChar = decks.cpuDeck[cDeck][cCard].getType();
		winner();
		attackNumber++;
		attackChar = decks.attack(cChar, pChar);
		consoleText="CPU ATTACK: \n";
		AttackLog.appendText(consoleText);
		if(attackChar == 'A'){
			consoleText="Attack Number "+attackNumber+": \n"+
					 "CPU Deck of Choice: "+cDeck+"\n"+
					 "CPU Uses : "+cChar+"\n"+
					 "Against : "+pChar+"\n"+
					 "It is ineffective and both live \n \n";
			AttackLog.appendText(consoleText);
		}
		else if(attackChar == 'B'){
			decks.p1Deck[pDeck][pCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "CPU Deck of Choice: "+cDeck+"\n"+
					     "CPU Uses : "+cChar+"\n"+
					     "Against : "+pChar+"\n"+
					     "It is effective and P's Card dies \n \n";
			AttackLog.appendText(consoleText);
			
		}
		else if(attackChar == 'C'){
			decks.cpuDeck[cDeck][cCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "CPU Deck of Choice: "+cDeck+"\n"+
					     "CPU Uses : "+cChar+"\n"+
					     "Against : "+pChar+"\n"+
					     "CPU's Card dies \n \n";
			AttackLog.appendText(consoleText);
		}
		else if(attackChar == 'D'){
			decks.cpuDeck[cDeck][cCard].kill();
			decks.p1Deck[pDeck][pCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "CPU Deck of Choice: "+cDeck+"\n"+
					     "CPU Uses : "+cChar+"\n"+
					     "Against : "+pChar+"\n"+
					     "Both die \n \n";
			AttackLog.appendText(consoleText);
		}
		AttackLog.setScrollTop(0);
	}
	public void playerAttackSequence(){
		//discard();
		winner();
		attackNumber++;
		attackChar = decks.attack(pChar, cChar);
		consoleText="PLAYER ATTACK: \n";
		AttackLog.appendText(consoleText);
		if(attackChar == 'A'){
			consoleText="Attack Number "+attackNumber+": \n"+
						 "Player Uses : "+pChar+"\n"+
						 "Against : "+cChar+"\n"+
						 "It is ineffective and both live \n \n";
			AttackLog.appendText(consoleText);
		}
		else if(attackChar == 'B'){
			decks.cpuDeck[cDeck][cCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "Player Uses : "+pChar+"\n"+
					     "Against : "+cChar+"\n"+
					     "It is effective and CPU's Card dies \n \n";
			AttackLog.appendText(consoleText);			
		}
		else if(attackChar == 'C'){
			decks.p1Deck[pDeck][pCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "Player Uses : "+pChar+"\n"+
					     "Against : "+cChar+"\n"+
					     "Nice Try! - Player's Card dies \n \n";
			AttackLog.appendText(consoleText);
		}
		else if(attackChar == 'D'){
			decks.cpuDeck[cDeck][cCard].kill();
			decks.p1Deck[pDeck][pCard].kill();
			consoleText="Attack Number "+attackNumber+": \n"+
					     "Player Uses : "+pChar+"\n"+
					     "Against : "+cChar+"\n"+
					     "Both die \n \n";
			AttackLog.appendText(consoleText);
		}
		AttackLog.setScrollTop(0);
		cSelected = false;
		pSelected = false;
		attackButton.setVisible(false);
	}
	public void resetImage(){
		PCardIMG.setImage(blankImage);
		CPUCardIMG.setImage(blankImage);
	}
	public void setPCardAndPic(){
		pCard = topPCardNum(pDeck);
		PCardIMG.setImage(selImage(pDeck, pCard));
		pChar = decks.p1Deck[pDeck][pCard].getType();
		pSelected = true;
		discard();
		if(cSelected && pSelected){
			attackButton.setVisible(true);
		}
	}
	public void setCCardAndPic(){
		cCard = topCCardNum(cDeck);
		CPUCardIMG.setImage(defaultImage);
		cChar = decks.cpuDeck[cDeck][cCard].getType();
		cSelected = true;
		discard();
		if(cSelected && pSelected){
			attackButton.setVisible(true);
		}
	}
	public int topPCardNum(int d){
		for(int c = 0; c < 5;c++){
			if(decks.p1Deck[d][c].getLifeState()){
				return c;
			}
		}
		
		return -1;
	}
	public int topCCardNum(int d){
		for(int c = 0; c < 5;c++){
			if(decks.cpuDeck[d][c].getLifeState()){
				return c;
			}
		}
		return -1;
	}
	public Image selImage(int d, int c){
		if(c>=0){
			char test = decks.p1Deck[d][c].getType();
			return ((test == '1')?(oneImage):((test=='2')?(twoImage):((test=='3')?(threeImage):((test=='4')?(fourImage):((test=='5')?(fiveImage):((test=='6')?(sixImage):((test=='A')?(archerImage):((test=='S')?(shieldImage):(crownImage)))))))));
		}
		else{
			return blankImage;
		}
	}
	public void playerTurn(boolean vis){
		playerTurn = vis;/*
		pD0Top.setVisible(vis);
		pD1Top.setVisible(vis);
		pD2Top.setVisible(vis);
		pD3Top.setVisible(vis);
		pD4Top.setVisible(vis);
		
		cD0Top.setVisible(vis);
		cD1Top.setVisible(vis);
		cD2Top.setVisible(vis);
		cD3Top.setVisible(vis);
		cD4Top.setVisible(vis);
		*/
	}
	public void startGame(){
		attackButton.setVisible(false);
		discardButton.setVisible(false);
		loadCards();
		showCards();
		setSelections();
		PCardIMG.setImage(blankImage);
		CPUCardIMG.setImage(blankImage);
		playerTurn(true);//Random Start - (r.nextInt(2)==0)?false:true
	}
	public void setSelections(){
		//set vis for Discard button
		//1st Deck
		int d = 0;
		if(topPCardNum(d) != -1 /*&& decks.p1Deck[d][topPCardNum(d)].getType() != 'S'*/){
			test = decks.getPlayerChar(d, topPCardNum(d));
			set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
			pD0Top.setText(set);
			
		}
		else{
			pDDDD = 0;
			//tempS = (decks.p1Deck[d][topPCardNum(d)].getType() != 'S') ? true : false;
			pD0Top.setVisible(false);
		}
		
		//2nd Deck
		d=1;
		if(topPCardNum(d) != -1 /*&& decks.p1Deck[d][topPCardNum(d)].getType() != 'S'*/){
			test = decks.getPlayerChar(d, topPCardNum(d));
			set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
			pD1Top.setText(set);
			
		}
		else{
			pDDDD = 1;
			//tempS = (decks.p1Deck[d][topPCardNum(d)].getType() != 'S') ? true : false;
			pD1Top.setVisible(false);
		}
		
		//3rd Deck
		d=2;
		if(topPCardNum(d) != -1 /*&& decks.p1Deck[d][topPCardNum(d)].getType() != 'S'*/){
			test = decks.getPlayerChar(d, topPCardNum(d));
			set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
			pD2Top.setText(set);
			
		}
		else{
			pDDDD = 2;
			//tempS = (decks.p1Deck[d][topPCardNum(d)].getType() != 'S') ? true : false;
			pD2Top.setVisible(false);
		}
		
		//4th Deck
		d=3;
		if(topPCardNum(d) != -1 /*&& decks.p1Deck[d][topPCardNum(d)].getType() != 'S'*/){
			test = decks.getPlayerChar(d, topPCardNum(d));
			set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
			pD3Top.setText(set);
			
		}
		else{
			pDDDD = 3;
			//tempS = (decks.p1Deck[d][topPCardNum(d)].getType() != 'S') ? true : false;
			pD3Top.setVisible(false);
		}
		
		//5th Deck
		d=4;
		if(topPCardNum(d) != -1 /*&& decks.p1Deck[d][topPCardNum(d)].getType() != 'S'*/){
			test = decks.getPlayerChar(d, topPCardNum(d));
			set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
			pD4Top.setText(set);
			
		}
		else{
			pDDDD = 4;
			//tempS = (decks.p1Deck[d][topPCardNum(d)].getType() != 'S') ? true : false;
			pD4Top.setVisible(false);
		}
		/*
		//char tempC = '\0';
		if(tempS){
				if(topPCardNum(0)!=-1){
					test = decks.getPlayerChar(pDDDD, topPCardNum(pDDDD));
					pD0Top.setVisible(true);
					set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
					pD0Top.setText(set);
				}
				else if(topPCardNum(1)!=-1){
					test = decks.getPlayerChar(pDDDD, topPCardNum(pDDDD));
					pD1Top.setVisible(true);
					set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
					pD1Top.setText(set);
				}
				else if(topPCardNum(2)!=-1){
					test = decks.getPlayerChar(pDDDD, topPCardNum(pDDDD));
					pD2Top.setVisible(true);
					set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
					pD2Top.setText(set);
				}
				else if(topPCardNum(3)!=-1){
					test = decks.getPlayerChar(pDDDD, topPCardNum(pDDDD));
					pD3Top.setVisible(true);
					set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
					pD3Top.setText(set);
				}
				else if(topPCardNum(4)!=-1){
					test = decks.getPlayerChar(pDDDD, topPCardNum(pDDDD));
					pD4Top.setVisible(true);
					set = (test == '0') ? ("Select"): (((test == '1') ? ("Dagger - ") : ((test == '2')? ("Sword - ") : ((test == '3')? ("Star - ") : ((test == '4')? ("Axe - ") : ((test == '5')? ("Halberd - ") : ((test == '6')? ("Lsword - ") : ((test == 'A')? ("Archer - ") : ((test == 'S')? ("Shield - "): ((test == 'C')? ("Crown - "): ""))))))))) + "'"+test+"'");
					pD4Top.setText(set);
				}	
		}
		else{
			
		}*/
		d=0;
		if(topCCardNum(d) == -1){
			cD0Top.setVisible(false);
		}
		
		
		d=1;
		if(topCCardNum(d) == -1){
			cD1Top.setVisible(false);
		}
		
		d=2;
		if(topCCardNum(d) == -1){
			cD2Top.setVisible(false);
		}
		
		d=3;
		if(topCCardNum(d) == -1){
			cD3Top.setVisible(false);
		}
		
		d=4;
		if(topCCardNum(d) == -1){
			cD4Top.setVisible(false);
		}
		
	}
	public void showCards(){
		pD0C0.setText(""+decks.p1Deck[0][0].getType());
		pD0C1.setText(""+decks.p1Deck[0][1].getType());
		pD0C2.setText(""+decks.p1Deck[0][2].getType());
		pD0C3.setText(""+decks.p1Deck[0][3].getType());
		pD0C4.setText(""+decks.p1Deck[0][4].getType());
		
		pD1C0.setText(""+decks.p1Deck[1][0].getType());
		pD1C1.setText(""+decks.p1Deck[1][1].getType());
		pD1C2.setText(""+decks.p1Deck[1][2].getType());
		pD1C3.setText(""+decks.p1Deck[1][3].getType());
		pD1C4.setText(""+decks.p1Deck[1][4].getType());
		
		pD2C0.setText(""+decks.p1Deck[2][0].getType());
		pD2C1.setText(""+decks.p1Deck[2][1].getType());
		pD2C2.setText(""+decks.p1Deck[2][2].getType());
		pD2C3.setText(""+decks.p1Deck[2][3].getType());
		pD2C4.setText(""+decks.p1Deck[2][4].getType());

		pD3C0.setText(""+decks.p1Deck[3][0].getType());
		pD3C1.setText(""+decks.p1Deck[3][1].getType());
		pD3C2.setText(""+decks.p1Deck[3][2].getType());
		pD3C3.setText(""+decks.p1Deck[3][3].getType());
		pD3C4.setText(""+decks.p1Deck[3][4].getType());

		pD4C0.setText(""+decks.p1Deck[4][0].getType());
		pD4C1.setText(""+decks.p1Deck[4][1].getType());
		pD4C2.setText(""+decks.p1Deck[4][2].getType());
		pD4C3.setText(""+decks.p1Deck[4][3].getType());
		pD4C4.setText(""+decks.p1Deck[4][4].getType());
		
	}
	public void loadCards(){
		char t;
		File f = new File("Chars2.txt");
		try(Scanner in = new Scanner(f);) {
			for(int d = 0; d < 5; d++){
				for(int c = 0; c < 5; c++){
					t = (char)in.nextInt();
					decks.p1Deck[d][c].setType(t);
					in.nextLine();
				}
				in.nextLine();
			}
			
			for(int d = 0; d < 5; d++){
				for(int c = 0; c < 5; c++){
					t = (char)in.nextInt();
					decks.cpuDeck[d][c].setType(t);
				}
				in.nextLine();
			}
			f.deleteOnExit();
			
		} 
		catch (FileNotFoundException e) {
			//Never Happens
			System.out.println("Why is this Happening");
		}
		//printCards();
	}
	public void printCards() /* Only use for testing purposes*/{
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(""+decks.getPlayerChar(j, i));
			}
			System.out.println("");
		}
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 5; j++){
				System.out.print(""+decks.getCPUChar(j, i));
			}
			System.out.println("");
		}
	}
	
}

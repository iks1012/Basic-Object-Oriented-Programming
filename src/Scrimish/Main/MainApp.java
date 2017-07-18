package Main;

import java.io.IOException;

import gameLogic.Variables;
import gameStuff.Decks;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainApp extends Application {
	
	
	
	//Add the Extensions of file loctions here (public)
	public String title                    = "Scrimish";
	public String mainMenuLocation         = "/Main/MainMenu.fxml";
	public String instructionsLocation     = "/Main/Instructions.fxml";
	public String creditsLocation          = "/Main/Credits.fxml";
	public String newGameLocation		   = "/Main/NewGame.fxml";
	public String inGameSelectCards1       = "/Main/InGameSelectCards1.fxml";
	public String pauseMenuLocation        = "/Main/PauseMenu.fxml";
	public String CardsNotSelectedLocation = "/Main/CardsNotSelected.fxml"; //Implement
	public String inGameLocation 		   = "/Main/InGame.fxml";
	public String PWinLocation             = "/Main/PWin.fxml";
	public String CPUWinLocation           = "/Main/CPUWin.fxml";
	
	//Initialization of other public Variables
	public Variables all = new Variables();
	public Decks decks   = new Decks();
	
	//Initialization of Max Number of cards
	public int onesRemaining      = 5;
	public int twosRemaining      = 5;
	public int threesRemaining    = 3;
	public int foursRemaining     = 3;
	public int fivesRemaining     = 2;
	public int sixRemaining       = 2;
	public int archersRemaining   = 2;
	public int shieldsRemaining   = 2;
	public int crownsRemaining    = 1;
	
	//All Variables that All Children get (protected)
    protected Stage primaryStage;
    protected Scene mainMenu;
    protected Scene instructions;
    protected Scene credits;
    protected Scene newGame;
    protected Scene selectCards;
    protected Scene pauseMenu;
    protected Scene cardsINC; //Implement
    protected Scene inGame;
    protected Scene PWin;
    protected Scene CPUWin;
    
    
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle(title);
        initMainMenu();
    }
    public void initMainMenu() {
        try {
            Parent mmP = FXMLLoader.load(getClass().getResource(mainMenuLocation));        	
            mainMenu = new Scene(mmP);
            primaryStage.setScene(mainMenu);
            primaryStage.show();
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
   

    public static void main(String[] args) {
    	launch(args);
    }
    
}

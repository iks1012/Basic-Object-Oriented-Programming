package gameStuff;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Main.MainApp;
import gameLogic.Variables;


public class Decks{
	private char[] card = {'1','1','1','1','1','2','2','2','2','2','3','3','3','4','4','4','5','5','6','6','A','A','S','S'};
	public Card[][] p1Deck;
	public Card[][] cpuDeck;
	
	
	public Decks(){
		p1Deck = new Card[5][5];
		cpuDeck = new Card[5][5];
		for(int deck = 0; deck < 5; deck++){
			for(int card = 0; card < 5; card++){
				p1Deck[deck][card] = new Card('0');
			}
		}
		for(int deck = 0; deck < 5; deck++){
			for(int card = 0; card < 5; card++){
				cpuDeck[deck][card] = new Card('0');
			}
		}
	}
	public char getPlayerChar(int deckNumber, int cardNumber){
		char p = p1Deck[deckNumber][cardNumber].getType();
		return p; 
		
	}
	public char getCPUChar(int deckNumber, int cardNumber){
		char c = cpuDeck[deckNumber][cardNumber].getType();
		return c;
	}
	public void setPlayerChar(int deckNumber, int cardNumber, char t){
		p1Deck[deckNumber][cardNumber].setType(t);
		
	}
	public void setCPUChar(int deckNumber, int cardNumber, char t){
		cpuDeck[deckNumber][cardNumber].setType(t);
	}
	
	
	
	
	public void setDecks(){
		//setCards(p1Deck); //remove this later
		setCards(cpuDeck);
	}
	
	public void setCards(Card[][] Deck){
		int now = 0;
		shuffleCards();
		Random r = new Random();
		int randomDeck = r.nextInt(5);
		Deck[randomDeck][4] = new Card('C');
		for(int i = 1; i < 6; i++){
			for(int j = 1; j < 6; j++){
				if(((i-1) == randomDeck) && j == 5){
					now++;
				}
				else{
					Deck[i-1][j-1] = new Card(card[(i)*(j)-now-1]);
				}		
			}
		}
	}
	
	
	
	public char attack(char a, char d){
		int at = ((a >= '1' && a <= '6')?(a-48):((a == 'A')?(7):((a == 'S')?(0):((a == 'C')?(-1):(-10)))));
		int de = ((d >= '1' && d <= '6')?(d-48):((d == 'A')?(0):((d == 'S')?(7):((d == 'C')?(-2):(-10)))));
		return ((at==de && at== 7)?('A'):((at > de)?('B'):((at < de && de!=7)?('C'):((at == de || (de==7 && at < de))?('D'):('\0')))));
	}
	/*
	 * FOR THE ATTACK METHOD
	 * 'A' - A LIVES AND D LIVES
	 * 'B' - A LIVES AND D DIE S
	 * 'C' - A DIE S AND D LIVES
	 * 'D' - A DIE S AND D DIE S
	 */
	
	public void shuffleCards(){
		Random rng = ThreadLocalRandom.current();
		for (int i = card.length - 1; i > 0; i--){
			int index = rng.nextInt(i + 1);
			char a = card[index];
			card[index] = card[i];
			card[i] = a;
			  
		}
	}
}

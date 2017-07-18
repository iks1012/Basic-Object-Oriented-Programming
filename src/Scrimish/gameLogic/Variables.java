package gameLogic;

public class Variables {
	private boolean isRunning;
	private boolean isPlaying;
	private int pCard;
	private int cCard;
	private int pDeck;
	private int cDeck;
	private boolean chosen;
	private char daONE;
	private boolean winner;
	
	public Variables(){
		this.isRunning = true;
		this.chosen = false;
		this.isPlaying = false;
		this.pCard = 0;
		this.pDeck = 0;
		this.cCard = 0;
		this.cDeck = 0;
		this.chosen = false;
		this.winner = false;
	}
	
	
	public boolean isRunning() {
		return isRunning;
	}
	public void setRunning(boolean isRunning) {
		this.isRunning = isRunning;
	}
	public boolean isPlaying() {
		return isPlaying;
	}
	public void setPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	public int getpCard() {
		return pCard;
	}
	public void setpCard(int pCard) {
		this.pCard = pCard;
	}
	public int getcCard() {
		return cCard;
	}
	public void setcCard(int cCard) {
		this.cCard = cCard;
	}
	public int getpDeck() {
		return pDeck;
	}
	public void setpDeck(int pDeck) {
		this.pDeck = pDeck;
	}
	public int getcDeck() {
		return cDeck;
	}
	public void setcDeck(int cDeck) {
		this.cDeck = cDeck;
	}
	public boolean isChosen() {
		return chosen;
	}
	public void setChosen(boolean chosen) {
		this.chosen = chosen;
	}
	public char getDaONE() {
		return daONE;
	}
	public void setDaONE(char daONE) {
		this.daONE = daONE;
	}
	public boolean isWinner() {
		return winner;
	}
	public void setWinner(boolean winner) {
		this.winner = winner;
	}
	
	
	
	
}

package gameStuff;

public class Card {
	private char type;
	private boolean alive;
	public Card(char t){
		this.type = t;
		this.alive = true;
	}
	public Card(){
		this.type = '0';
		this.alive = true;
	}
	public void kill(){
		type = '0';
		alive = false;
	}
	public void setType(char t){
		this.type = t;
	}
	public char getType(){
		return type;
	}
	public void setLife(boolean a){
		this.alive = a;
	}
	public boolean getLifeState(){
		return alive;
	}
}

package Quiz13A;

public abstract class Animal {
	protected String species;
	protected String sound;
	
	public Animal(String species, String sound) {
		super();
		this.species = species;
		this.sound = sound;
	}
	
	public abstract void makeSound();
	
	public abstract void move();
	
}

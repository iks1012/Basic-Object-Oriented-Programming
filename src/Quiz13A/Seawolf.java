package Quiz13A;

public class Seawolf extends Fish {
	public Seawolf(){ //needs no args as you hard coded the parameters to pass up
		super("Unknown", "I'm a Seawolf!");
	}
	
	@Override
	public void makeSound(){
		System.out.println("The Seawolf chants " + sound); //variable was never assigned in this class up it was actually defined above
	}
	
}

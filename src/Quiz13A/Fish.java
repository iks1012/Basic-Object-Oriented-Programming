package Quiz13A;

public abstract class Fish extends Animal{
	public Fish(String species, String sound) {// this is called constructor chaining
		super(species, sound);//sending it up to the parent ^^^^^^^^^^^^^^^^^^^^
	}
	@Override
	public void move(){
		System.out.println(species + " is swimming");
	}
}

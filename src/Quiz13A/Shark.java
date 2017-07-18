package Quiz13A;

public class Shark extends Fish{
	protected int peopleEaten; //assumed to be zero
	public Shark(String species, String sound) {
		super(species, sound);
	}

	@Override
	public void makeSound() {
		System.out.println(species + " has made "+sound);
	}

	public int getPeopleEaten() {
		return peopleEaten;
	}

	public void setPeopleEaten(int peopleEaten) {
		this.peopleEaten = peopleEaten;
	}
	
}

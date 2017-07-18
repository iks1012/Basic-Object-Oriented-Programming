package Quiz13A;

public class Aquarium {
	public static void main(String[] args){
		Animal[] animals = new Animal[8]; //object points to the starting class
		
		animals[0] = new Shark("Tiger Shark", "lalala");
		animals[1] = new Seawolf();
		for(Animal a: animals){
			if(a != null)
				a.makeSound(); //dynamic binding: binds a prticular implementation of the method to the call
			
		}
	}
}

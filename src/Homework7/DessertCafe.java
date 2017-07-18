package Homework7;



import java.util.ArrayList; 

public class DessertCafe {
	public static void main(String[] args){
		ArrayList<Dessert> desserts = new ArrayList<Dessert>();
		desserts.add(new Cake(1));
		desserts.add(new Cake(2));
		
		desserts.add(new CookiePack(2, 2));
		desserts.add(new CookiePack(3, 3));
		
		desserts.add(new IceCream(2));
		desserts.add(new IceCream(8));
		
		desserts.add(new Sundae(2,5));
		desserts.add(new Sundae(8,5));
		
		for(int i = 0; i < desserts.size(); i++){
			System.out.println(desserts.get(i).getName()+": $"+desserts.get(i).getCost()+".00");	
		}
	}
}
//DESSERT ------------------------DESSERT-------------------DESSERT
abstract class Dessert {
	protected String name;
	abstract public int getCost();
	abstract public String getName();
	public String toString(){
		return getName()+getCost();
	}
}
// CAKE ----------------------------CAKE----------------------CAKE
class Cake extends Dessert {
	private int layers;
	public Cake(int layers){
		this.layers = layers;
	}
	public int getCost() {
		return 15+(2*layers);
	}
	public String getName() {
		return "Cake";
	}
}
// COOKIEPACK--------------------------COOKIEPACK-----------------COOKIEPACK
class CookiePack extends Dessert{
	private int cookiePerPack;
	private int pricePerCookie;
	
	public CookiePack(int cookiePerPack, int pricePerCookie){
		this.cookiePerPack = cookiePerPack;
		this.pricePerCookie = pricePerCookie;
	}
	
	public int getCost() {
		return cookiePerPack * pricePerCookie;
	} 
	
	public String getName() {
		
		return "Cookie Pack";
	}
}
//ICECREAM----------------------------ICECREAM---------------------ICECREAM
class IceCream extends Dessert {
	private int cost;
	public IceCream(int cost){
		this.cost = cost;
	}
	public int getCost() {
		return cost;
	}
	public String getName() {
		return "Ice Cream";
	}
}
//SUNDAE --------------------------------SUNDAE----------------------SUNDAE
class Sundae extends IceCream{
	public Sundae(int cost, int topCost) {
		super(cost+topCost);
	}
}













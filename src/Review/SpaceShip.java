
package Review;

public class SpaceShip {
	public static void main(String[] args){
		spaceShip(10);
	}
	public static void spaceShip(int n){
		printUpWing(n,'\\',1);
		printBod(2*n+1,'>');
		printLowWing(n,'/',(2*n-1));
	}
	public static void p(String s){
		System.out.print(s);
	}
	public static void pln(String s){
		System.out.println(s);
	}
	public static void printUpWing(int n, char c, int i){
		printBod(i,c);
		if(i == 2*(n-1)+1){
			
		}
		else{
			printUpWing(n,c,(i+2));
		}
	}
	public static void printBod(int i, char c){
		if(i==1){
			pln(""+c);
		}
		else{
			p(""+c);
			printBod(i-1,c);
		}
	}
	public static void printLowWing(int n, char c, int i){
		if(i==1){
			pln(""+c);
		}
		else{
			printBod(i,c);
			printLowWing(n,c,(i-2));
		}
	}
}

import java.util.Scanner;

public class PentagonalNumbers {
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer for the n pentagonal numberrs you want displayed:");
		int n = in.nextInt();
		
		
		getPentagonalNumber(n);
	}
	public static void getPentagonalNumber(int n){
		int x;
		int y;
		if(n%10 > 0){
			for(int i = 0; i < ((n/10)+1); i++){
				for(int j = 0; j < ( ((i+1) > (n/10)) ? (n%10): 10 );j++){
					x = i*10+j+1;
					y = (x*(3*x-1))/2;
					
					System.out.print(y+" ");
				}
				System.out.println("");
			}			
		}
		else{
			for(int i = 0; i < ((n/10)); i++){
				for(int j = 0; j < ( ((i+1) > (n/10)) ? (n%10): 10 );j++){
					x = i*10+j+1;
					y = (x*(3*x-1))/2;
					
					System.out.print(y+" ");
				}
				System.out.println("");
			}	
		}
	}
}

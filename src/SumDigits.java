import java.util.Scanner;

public class SumDigits {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer:");
		long n = in.nextLong();
		System.out.print("The sum of the digits in "+n+" is "+ sumDigits(n));
	}
	
	
	
	public static int sumDigits(long n){
		int sum = 0;
		while (n>0){
			sum+= n%10;
			n/=10;
		}
		return sum;
	}

}

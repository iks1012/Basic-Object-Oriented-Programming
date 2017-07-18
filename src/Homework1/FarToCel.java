package Homework1;
import java.util.Scanner;

public class FarToCel {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a degree in Celcius: ");
		double temp = in.nextDouble();
		double oldTemp = temp;
		temp*=1.8;
		temp+=32;
		System.out.print(oldTemp+" in Celcius is "+temp+" in Fahrenheit.");
	}

}

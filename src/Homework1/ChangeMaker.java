package Homework1;
import java.util.Scanner;
public class ChangeMaker {
	public static void main(String[] args) {
		int change, rem, quarters, dimes, nickels, pennies;
		System.out.print("Input change amount (1-99): ");
		Scanner input = new Scanner(System.in);
		change = input.nextInt();
		quarters = change / 25;
		rem = change % 25;
		dimes = rem / 10;
		rem = rem % 10;
		nickels = rem / 5;
		rem = rem % 5;
		pennies = rem;
		System.out.print(quarters + " quarters, " + dimes +
		" dimes, " + nickels + " nickels and " +
		pennies + " pennies");
	}
}
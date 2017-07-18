package Homework3;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String line = in.nextLine();
		System.out.print("The string is of length "+ line.length() +" and the first character is " + line.charAt(0));

	}

}

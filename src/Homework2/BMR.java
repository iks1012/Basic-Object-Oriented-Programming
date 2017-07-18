package Homework2;

import java.util.Scanner;

public class BMR {
	public static void main(String[] args) {
		double BMR;
		double m, h, a ,s;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the person’s weight in pounds: ");
		m = in.nextDouble();
		m*=0.45359237;
		System.out.print("Enter the person's height in inches: ");
		h = in.nextDouble();
		h*=2.54;
		System.out.print("Enter the person's age: ");
		a = in.nextDouble();
		s = 5.0;
		BMR = 10*m + 6.25*h - 5*a + s;
		System.out.println("BMR for a man: "+ BMR + " kcal/day");
		BMR-=166;
		System.out.println("BMR for a woman: "+ BMR + " kcal/day");
	}

}

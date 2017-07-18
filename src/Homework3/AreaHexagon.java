package Homework3;

import java.util.Scanner;

public class AreaHexagon {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the side:");
		double length = in.nextDouble();
		double area = (int) (100*((6*length*length)/((4*Math.tan((Math.PI)/6)))));
		System.out.print("The area of the hexagon is "+ (area)/100);
	}

}

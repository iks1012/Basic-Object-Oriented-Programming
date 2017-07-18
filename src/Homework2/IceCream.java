/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 2, Problem 1 *
 *****************************************************/

package Homework2;
import java.*;
import java.util.Scanner;

public class IceCream {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the radius of the ice cream and cone in inches: ");
		double radius = s.nextDouble();
		System.out.print("Enter the height of the cone in inches: ");
		double height = s.nextDouble();
		double volume = ((3.14 * (height) * (Math.pow(radius, 2)))/3) + ((3.14 * 4 * Math.pow(radius, 3))/6);
		System.out.print("Volume of the ice cream cone: " + volume);
	}

}

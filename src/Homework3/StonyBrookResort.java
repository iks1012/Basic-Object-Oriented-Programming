/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 3, Problem 2 *
 *****************************************************/

package Homework3;

import java.util.Scanner;

public class StonyBrookResort {
	static double adultPricePerDay = 125.0;
	static double childPricePerDay= 75.0;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter number of adults: ");
		int adults = in.nextInt();
		System.out.print("Enter number of children: ");
		int children = in.nextInt();
		System.out.print("Enter length of vacation in days: ");
		int totalDays = in.nextInt();
		System.out.print("Enter day of week that vacation starts: ");
		in.nextLine();
		String startDay = in.nextLine();
		System.out.print("Total before discounts: $"); System.out.printf("%.2f", subTotalPrice(totalDays, adults, children)); System.out.println(""); //these are just added print statements and the 'ln' shows the end of that line
		System.out.print("Discounts: $"); System.out.printf("%.2f", totalDiscounts(startDay, totalDays, adults)); System.out.println("");
		System.out.print("Service charges: $"); System.out.printf("%.2f", totalServiceCharges(adults, children)*subTotalPrice(totalDays, adults, children)); System.out.println("");
		System.out.print("Grand Total: $"); System.out.printf("%.2f", grandTotalPrice(subTotalPrice(totalDays, adults, children), totalDiscounts(startDay, totalDays, adults), totalServiceCharges(adults, children)*subTotalPrice(totalDays, adults, children)));  System.out.println("");
	}
	public static double totalServiceCharges(int adults, int children){
		double totalServiceCharges = 00;
		if((adults + children) >= 6){
			totalServiceCharges += 0.05;
		}
		return totalServiceCharges;
	}
	public static double totalDiscounts(String startDay, int totalDays, int adults){
		double totalDiscounts = 0.0;
		if((startDay.equalsIgnoreCase("monday")) && (totalDays <= 4)){
			totalDiscounts+=150.00;
		}
		else if(totalDays > 5){
			totalDiscounts += ((125*0.25)*(totalDays-5)*(adults));
		}
		return totalDiscounts;
	}
	public static double subTotalPrice(int totalDays, int adults, int children){
		double subTotalPrice = 0.0;
		subTotalPrice += totalDays * (adults*125 + children*75);		
		return subTotalPrice;
	}
	public static double grandTotalPrice(double subTotalPrice, double totalDiscounts, double totalServiceCharges){
		double grandTotalPrice = subTotalPrice - totalDiscounts + totalServiceCharges;
		return grandTotalPrice;
	}
}

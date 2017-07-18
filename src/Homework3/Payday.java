/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 3, Problem 3 *
 *****************************************************/

package Homework3;

import java.util.Scanner;

public class Payday {

	static Scanner in = new Scanner(System.in);
	static final double TAX_RATE = 0.125;
	static double grossPay;
	static double taxes = grossPay * TAX_RATE;
	static double netPay = grossPay - taxes;
	
	
	public static void main(String[] args) {
		
		System.out.print("Choose employee type: (m) manager (h) hourly (c) comission (p) pieceworker: ");
		String mhcp = in.nextLine();
		if(mhcp.equalsIgnoreCase("m"))
			manager();
		else if(mhcp.equalsIgnoreCase("h"))
			hourly();	
		else if(mhcp.equalsIgnoreCase("c"))
			commission();
		else if(mhcp.equalsIgnoreCase("p"))
			pieceworker();
		System.out.print("Gross pay: $");
		System.out.printf("%.2f", grossPay);
		taxes = grossPay * TAX_RATE;
		netPay = grossPay - taxes;
		System.out.println("");
		System.out.print("Taxes: $");
		System.out.printf("%.2f", taxes);
		System.out.println("");
		System.out.print("Net pay: $");
		System.out.printf("%.2f", netPay);
	}
	
	public static void manager(){
		System.out.print("Enter weekly salary: ");
		double salary = in.nextDouble();
		grossPay = salary;
	}
	public static void hourly(){
		System.out.print("Enter hourly wage: ");
		double wage = in.nextDouble();
		System.out.print("Enter hours worked: ");
		double hours = in.nextDouble();
		if(hours > 35.000)
			grossPay = (35*wage) + ((hours-35)*(2*wage));
		else
			grossPay = hours*wage;
	}
	public static void commission(){
		System.out.print("Enter weekly sales: ");
		double sales = in.nextDouble();
		grossPay = 250.0 + 0.057*sales;
	}
	public static void pieceworker(){
		System.out.print("Enter pieces produced: ");
		int pieces = in.nextInt();
		System.out.print("Enter pay per piece: ");
		double payPerPiece = in.nextDouble();
		grossPay = pieces * payPerPiece;
	}
}

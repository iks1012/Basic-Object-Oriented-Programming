package Homework4;

/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 4, Problem 2 *
 *****************************************************/


import java.util.Scanner;

public class BaseToBase {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int finalBase, startBase;
		System.out.print("Enter Number: ");
		String OGNum = in.nextLine();
		System.out.print("Enter starting base: ");
		startBase = in.nextInt();
		System.out.print("Enter ending base: ");
		finalBase = in.nextInt();
		
		System.out.print("Result: "+toBase(OGNum, startBase, finalBase));
	}
	public static String toBase(String OGNum, int startBase, int finalBase){
		String finalNum = (Integer.toString(Integer.parseInt(OGNum, startBase), finalBase)).toUpperCase();	
		return finalNum;
	}

}

/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 3, Problem 4 *
 *****************************************************/
package Homework3;

import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter year (e.g., 1918): ");
		int year = in.nextInt();
		
		System.out.print("Enter month (1-12): ");
		int month = in.nextInt();
		if(month == 1 || month == 2){
			month += 12;
			year -=1;
		}
		
		System.out.print("Enter the day of the month (1-31): ");
		int day = in.nextInt();
		
		System.out.print("The day of the week is " + dayOfTheWeek(month, day, year));		
	}
	public static String dayOfTheWeek(int month, int day, int year){
		String dayOfTheWeek = "";
		int d = ((day + ((13*(month + 1))/5) + (year%100)+ ((year%100)/4)+ ((year/100)/4) + (5*(year/100)) )%7);
		String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
		dayOfTheWeek += days[d];
		return dayOfTheWeek;
	}

}

package Homework3;

import java.util.Scanner;

public class FindFutureDates {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter today's day:");
		int day = in.nextInt();
		System.out.print("Enter the number of days elapsed since today:");
		int daysElapsed = in.nextInt();
		String[] dayOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		if (day<=7){
			System.out.print("Today is "+ dayOfWeek[day] + " and the future day is " + dayOfWeek[(day+daysElapsed)%7]);
		}
		else{
			System.out.print("Today is an invalid starting day. Today's day must be 0-6. and the future day is " + dayOfWeek[(day+daysElapsed)%7]);
		}
		
	}

}

/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 3, Problem 1 *
 *****************************************************/
package Homework3;


import java.util.Scanner;

public class PalindromicDate {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter month: ");
		int maxDay = 0;
		String mon = in.nextLine();
		int month = 0;
		boolean flag = true;
		if(mon.equalsIgnoreCase("january")){
			month = 1;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("february")){
			month = 2;
			maxDay = 28;
		}
		else if(mon.equalsIgnoreCase("march")){
			month = 3;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("april")){
			month = 4;
			maxDay = 30;
		}
		else if(mon.equalsIgnoreCase("may")){
			month = 5;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("june")){
			month = 6;
			maxDay = 30;
		}
		else if(mon.equalsIgnoreCase("july")){
			month = 7;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("august")){
			month = 8;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("september")){
			month = 9;
			maxDay = 30;
		}
		else if(mon.equalsIgnoreCase("october")){
			month = 10;
			maxDay = 31;
		}
		else if(mon.equalsIgnoreCase("november")){
			month = 11;
			maxDay = 30;
		}
		else if(mon.equalsIgnoreCase("december")){
			month = 12;
			maxDay = 31;
		}
		else {
			flag &= false;
		}
		System.out.print("Enter day: ");
		int day = in.nextInt();
		System.out.print("Enter year: ");
		int year = in.nextInt();
		
		if((year % 4 == 0) && (month == 2)){
			maxDay = 29; //if(leapYear)
		}
		if(year % 100 == 0 && year % 400 != 0 && maxDay == 29){
			maxDay = 28;
		}
		
		if(year/9999 == 0){
			year %= 100;
		}
		else{
			//Do Nothing
		}
		String finalDate = ""; 
		if((day > maxDay) || (day <= 0)){
			flag &= false;
		}
		else{
			flag &= true;
		}
		
		if(flag){
			if(month < 10){
				finalDate = ("0"+month);
			}
			else{
				finalDate = (""+month);
			}
		}
		else{
			flag &= false;
		}
		if(flag){
			if(day < 10){
				finalDate += ("/0" + day);
			}
			else if(day >= 10){
				finalDate += ("/"+day);
			}
			else{
				flag &= false;
			}
		}
		else{
			flag &= false;
		}
		if(flag){
			if(year < 10){
				finalDate +=("/0"+year);
			}
			else if(year >= 10){
				finalDate += ("/" + year);
			}
			else{
				flag &= false;
			}
		}
		else{
			
		}
		boolean palindrome = true;
		if(flag){
			//check for palindrome
			
			for(int i = 0; i < finalDate.length()-1;){
				if(finalDate.charAt(i) == finalDate.charAt((finalDate.length()-1) - i) ){
					flag &= true;
					palindrome &= true;
				}
				else{
					palindrome &= false;
				}
				
				i++;
			}
		}
		else{
			//do nothing
		}
		if(flag){
			System.out.println("Reformatted Date: "+finalDate);
			if(palindrome){
				System.out.print("Palindrome? Yes");
			}
			else{
				System.out.print("Palindrome? No");
			}
		}
		else{
			System.out.println(("Bad Input."));
		}
		
	}
}


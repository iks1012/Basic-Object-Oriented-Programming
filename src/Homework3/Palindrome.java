package Homework3;

import java.util.Scanner;

public class Palindrome {
static int integer;
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a three-digit integer:");
		
		boolean isPalindrome = isPalindrome(in.nextInt());
		if(isPalindrome){
			System.out.print(integer + " is a palindrome");
		}
		else{
			System.out.print(integer + " is not a palindrome");
		}

	}
	public static boolean isPalindrome(int number){
		integer = number;
		boolean returnThis = true;
		if(number <= 0){
			number*= -1;
		}
		String num = ""+number;
		int length = num.length();
		for(int i = 0; i <= length-1; i++){
			if(num.charAt(i)==num.charAt((length-1)-i)){
				returnThis &= true;
			}
			else{
				returnThis &=false;
			}
		}
		return returnThis;
	}
}

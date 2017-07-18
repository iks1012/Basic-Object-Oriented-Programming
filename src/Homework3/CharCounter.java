package Homework3;

import java.util.Scanner;

public class CharCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string:");
		String word = in.nextLine();
		System.out.print(" Enter a character:");
		char character = in.next().charAt(0);
		
		System.out.print(" "+ character +" occurs "+ count(word, character) +" times in the string");
		
	}
	public static int count(String str, char a){
		int numOfOccurances = 0;
		int length = str.length();
		for(int i = 0; i < length; i ++){
			if(str.charAt(i) == a){
				numOfOccurances++;
			}
		}
		
		return numOfOccurances;
	}
}

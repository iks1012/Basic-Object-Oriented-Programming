package Homework3;

import java.util.Scanner;

public class HasSubstring {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string s1:");
		String str1 = in.nextLine();
		System.out.print("Enter string s2:");
		String str2 = in.nextLine();
		boolean contains = str1.contains(str2);
		if(contains){
			System.out.print(str2 + " is a substring of "+str1);
		}
		else{
			System.out.print(str2 + " is not a substring of "+str1);
		}
	}

}

package Homework3;

import java.util.Scanner;

public class Hex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal value( 0 to 15):");
		int num = in.nextInt();
		char hexVal ='0';
		switch(num){
		case 0: hexVal = '0';
			break;
		case 1: hexVal = '1';
			break;
		case 2: hexVal = '2';
			break;
		case 3: hexVal = '3';
			break;
		case 4: hexVal = '4';
			break;
		case 5: hexVal = '5';
			break;
		case 6: hexVal = '6';
			break;
		case 7: hexVal = '7';
			break;
		case 8: hexVal = '8';
			break;
		case 9: hexVal = '9';
			break;
		case 10: hexVal = 'A';
			break;
		case 11: hexVal = 'B';
			break;
		case 12: hexVal = 'C';
			break;
		case 13: hexVal = 'D';
			break;
		case 14: hexVal = 'E';
			break;
		case 15: hexVal = 'F';
			break;
		
		}
		System.out.print(" The hex value is " + hexVal);	
	}

}

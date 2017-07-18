/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 2, Problem 3 *
 * Enter a negative number to see what happens       *
 *****************************************************/

package Homework2;

import java.util.Scanner;

public class GreekMoney {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the Number of oboloi: ");
		boolean flag = false;
		int limit = 1;
		int oboloi = in.nextInt();
		int talent = 0;
		int mina = 0;
		int drachma = 0;
		int oneTalent = 60 * 70 * 6;
		int oneMina = 70 * 6;
		int oneDrachma = 6;
		for(int counter = 0; counter < limit; counter++){
			if(oboloi >= oneTalent){
				oboloi-=oneTalent;
				talent++;
				flag = true;
				limit++;
			}
			else if(oboloi >= oneMina){
				oboloi-=oneMina;
				mina++;
				flag = true;
				limit++;
			}
			else if(oboloi >= oneDrachma){
				oboloi-=oneDrachma;
				drachma++;
				flag = true;
				limit++;
			}
			else if (0 > oboloi){
				System.out.println("Please Pay back the Money you owe as you entered a negative number");
				flag = false;
			}
			else if (oboloi == 0){
				flag = true;
			}
			else{
				
			}
			
		}
		if(flag){
			if(talent > 1){
				System.out.println(talent + " talents");
			}
			else{
				System.out.println(talent + " talent");
			}
			if(mina > 1){
				System.out.println(mina + " minae");
			}
			else{
				System.out.println(mina + " mina");
			}
			if(drachma > 1){
				System.out.println(drachma + " drachmae");
			}
			else{
				System.out.println(drachma + " drachma");
			}
			if(oboloi > 1){
				System.out.println(oboloi + " oboloi");
			}
			else{
				System.out.println(oboloi + " obolus");
			}
			
		}
		else{
			System.out.println("Since you inputed an invalid value for the amount of oboloi, you do not get an answer.");
		}
	}

}

/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 2, Problem 2 *
 *****************************************************/

package Homework2;
import java.util.Scanner;

public class PetShelter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of cats: ");
		int cats = in.nextInt();
		System.out.print("Enter the number of dogs: ");
		int dogs = in.nextInt();
		System.out.print("Enter the weekly budget: ");
		int weeklyBudget = in.nextInt();
		int dogBudget = ((2*(weeklyBudget))/( cats + 2*dogs)) - 1;
		System.out.print("Amount to spend per dog: $"+(dogBudget));
	}

}

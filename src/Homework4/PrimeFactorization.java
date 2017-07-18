package Homework4;

/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 4, Problem 1 *
 *****************************************************/

import java.util.Scanner;
public class PrimeFactorization {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numbers = "";
		boolean flag = true;
		System.out.print("Enter integers: ");
        numbers = in.nextLine().trim();
        int arrayLength = 0;
        int number = 1;
        for(int i = 0; i<numbers.length(); i++){
        	if(numbers.charAt(i)==' '){
        		arrayLength++;
        	}
        }
        int lastSpace;
        int firstPOS = 0;
        int[] nums = new int[arrayLength];
       
        for(int i = 0; i<arrayLength; i++){
        	lastSpace = numbers.indexOf(' ', firstPOS);
        	nums[i] = Integer.parseInt(numbers.substring(firstPOS, lastSpace));
        	firstPOS = lastSpace+1;
        	if(i != arrayLength && nums[i] > 0){
        		flag &= true;
        		number *= nums[i];
        	}
        	else if (nums[i] < 0){
        		flag &= false;
        	}
        }
        int count;
        if(number > 0 && flag){
        	System.out.println("Product: "+number);
        	System.out.print("Prime Factorization: ");
	        for (int i = 2; i<=(number); i++) {
	            count = 0;
	            while (number % i == 0) {
	                number /= i;
	                count++;
	                if (count == 0) {
	                    continue;
	                }
	            }
	            if (count != 0)	            
	            System.out.print(i+ "^" + count +" ");
	        }
        }
        else{
        	System.out.print("Bad input.");
        }
	}

}

package Homework4;

import java.util.Scanner;

public class AvgWithLoop {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String numbers="";
		
		System.out.print("Enter an integer, the input ends if it is 0:");
        numbers = in.nextLine();
        
		
        int[] values = stringToInt(numbers);
        System.out.println("The number of positives is " + numPositive(values));
        System.out.println("The number of negatives is " + numNegative(values));
        System.out.println("The total is " + total(values));
        System.out.print("The average is " + average(values));
	}
	public static int[] stringToInt(String numbers){
		
        int arrayLength = 0;
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
        }
        return nums;
	}
	public static int numPositive(int[] nums){
		int num = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i]>0){
				num++;
			}
		}
		return num;
	}
	public static int numNegative(int[] nums){
		int num = 0;
		for(int i = 0; i < nums.length; i++){
			if(nums[i]<0){
				num++;
			}
		}
		return num;
	}
	public static double total(int[] nums){
		double total = 0;
		for(int i = 0; i < nums.length; i++){
			total+=nums[i];
		}
		return total;
	}
	public static double average(int[] nums){
		double avg = 0.0;
		double total = (double) total(nums);
		avg = Math.round((total /(nums.length))*100);
		avg/=100;
		return avg;
	}
	
}

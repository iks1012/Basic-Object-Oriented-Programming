package Homework3;

import java.util.Scanner;

public class SortCities {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first city:");
		String s1 = in.nextLine();
		System.out.print("Enter the second city:");	
		String s2 = in.nextLine();
		System.out.print("Enter the third city:");	
		String s3 = in.nextLine();
		String[] arr = {s1, s2, s3};
		
		
		String tmp;
		    for (int i = 0;i < arr.length;i++){
		      tmp = arr[i];
		      for (int j = 0;j < arr.length;j++){
		        if (i == j) continue;
		        int x = tmp.compareTo(arr[j]);
		        if (x < 0){
		          tmp = arr[j];
		          arr[j] = arr[i];
		          arr[i] = tmp;
		        }
		      }
		    }
		    
		    System.out.print("The Three cities in alphabetical order are");
		    for (int i = 0;i < arr.length;i++)
		      System.out.print(" "+arr[i]);
		  }

	}



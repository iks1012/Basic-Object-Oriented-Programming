package Homework6;

import java.util.Scanner;

public class HeadsAndTails {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an integer representing the state of the coins:");
		int n = in.nextInt();
		formMatrix(n);
	}
	public static void formMatrix(int n){
		char[][] mat = new char[3][3];
		for(int i = 0 ;i < 3 ;i++){
			for(int j = 0; j < 3; j++){
				mat[i][j] = (n%2 == 1)? 'T' : 'H';
				n/=2;
			}
		}
		
		for(int i = 2; i >= 0; i--){
			for(int j = 2; j >= 0;j--){
				System.out.print(mat[i][j] + ((j == 2 || j == 1 )? " " : ""));
			}
			System.out.println("");
		}
		
	}
}
package Homework6;

import java.util.Scanner;
public class SumMajorDiagonal{ 
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter dimension n of nxn matrix:");
		int n = in.nextInt();
		double[][] m = new double[n][n];
		double sum = sumMajorDiagonal(m);
		System.out.print(sum);
	}
	
	
	public static double sumMajorDiagonal(double[][] n){
		Scanner in = new Scanner(System.in);
		double sum = 0.0;
		for(int i = 0; i< n.length; i++){
			System.out.print("Enter row "+i+":");
			for(int j = 0; j < n.length; j++){
				n[i][j] = in.nextDouble();
				if(i==j)
					sum+= n[i][i];
			}
		}
		return sum;
	}
}
package Lab08;

import java.util.Arrays;
import java.util.Scanner;

public class distinction {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		final int distinctNumbers = 10;
		int[] arr = new int[distinctNumbers];
		boolean flag;
		int temp;
		for(int i = 0; i < 10; i++){
			System.out.print("Enter Integer: ");
			temp = in.nextInt();
			flag = true;
			for(int j = 0; j < i; j++)
				if(arr[j]==temp)
					flag &= false;
			if(flag)
				arr[i] = temp;
			else
				i--;
		}
		for(int i = 0; i < 10; i++)
			System.out.print(arr[i]+" ");
		
	}
}

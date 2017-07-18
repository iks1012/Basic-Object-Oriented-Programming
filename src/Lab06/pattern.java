package Lab06;

public class pattern {
	public static void count(int n){
		for(int i = 1; i <= n; i++)
			for(int x = i; x  > 0;x--)
				System.out.print(x + " ");
			System.out.println("");	
	}
	public static void main(String[] args){
		int n = 5;
		count(n);
	}
}

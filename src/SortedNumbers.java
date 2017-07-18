public class SortedNumbers{
public static void main(String[] args){
	java.util.Scanner in = new java.util.Scanner(System.in);
	System.out.print("Enter the three numbers:");
	String nums	= in.nextLine().trim();
	int firstSpace = nums.indexOf(' ');
	int secondSpace = nums.indexOf(' ', firstSpace);
	
	double n1 = Double.parseDouble(nums.substring(0, firstSpace).trim());
	double n2 = Double.parseDouble(nums.substring(firstSpace+1, secondSpace).trim());
	double n3 = Double.parseDouble(nums.substring(secondSpace+1).trim());
	
	System.out.println(n1);
	System.out.println(n2);
	System.out.println(n3);
	//displaySortedNumbers(n1, n2, n3);
	
}
public static void displaySortedNumbers(double num1, double num2, double num3) {
		int n, c, d;
		double swap;
	 	n = 3;
		double array[] = {num1, num2, num3};
	    for (c = 0; c < ( n - 1 ); c++) {
		  for (d = 0; d < n - c - 1; d++) {
		    if (array[d] > array[d+1]) /* For descending order use < */
		    {
		      swap       = array[d];
		      array[d]   = array[d+1];
		      array[d+1] = swap;
		    }
		  }
	    }
	    for (c = 0; c < n; c++) 
	      System.out.print(" "+array[c]);
	  }
}
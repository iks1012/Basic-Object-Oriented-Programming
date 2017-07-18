package Homework4;
/***************************************************** 
 * Name: Ishan Sethi                                 *
 * Stony Brook ID#: 110941217                        *
 * Course Number: CSE 114                            *
 * Assignment name and Number: Homework 4, Problem 3 *
 *****************************************************/
import java.util.Scanner;

public class RunLengthEncoding {
	public static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter input string: ");
		String uncompressedString = in.nextLine();
		if(uncompressedString.equals(uncompressedString.toUpperCase()) )
			System.out.print(compress(uncompressedString));
		else
			System.out.print("Bad input.");
	}
	public static String compress(String s){
		String returnThis = "";
		int counter = 0;
		String badIn = "Bad input.";
		System.out.print("Enter flag character: ");
		char flagChar = in.nextLine().charAt(0);
		boolean flag = true;
		if(flagChar == '#' || flagChar =='$' || flagChar == '&' || flagChar == '*')
			flag &= true;
		else
			return badIn;
		int ttlOcc = 1;
		for(int newIn = 0; newIn < s.length(); newIn+=ttlOcc ){
				ttlOcc = 1; 
				flag = true;
				for(int t = newIn; t < s.length()-1 ;t++){
					if(s.charAt(t) == s.charAt(t+1) && flag){
						ttlOcc++;
					}
					else{
						flag&=false;
					}
						
				}
				if(ttlOcc > 3){	
					returnThis += ((char)flagChar +""+ (char)s.charAt(newIn)+"" + ""+ttlOcc+"");
					
				}
				else{
					for(int a = 1 ; a <= ttlOcc ; a++ )
						returnThis += s.charAt(newIn);
				}
			}
		return "Encoded: "+returnThis;
	}

}

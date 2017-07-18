package Homework7;

import java.io.IOException;
import java.util.Scanner;

public class HexBinDec {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 2; i++){ //both cases
			try{
				System.out.println("Enter a HexaDecimal Number: ");
				String hex = in.nextLine();
				hex = hex.toUpperCase();
				int dec = hex2Dec(hex);
				System.out.println(dec);
				
			}
			catch(HexFormatException h){
				System.out.println("Either the output number is too large or the format for the Input is wrong");
			}
		}
		
		for(int i = 0; i < 2; i++){ //both cases
			try{
				System.out.println("Enter a Binary Number: ");
				String bin = in.nextLine();
				int dec = bin2Dec(bin);
				System.out.println(dec);
			}
			catch(BinaryFormatException b){
				System.out.println("Either the input number results in a number that is out of bounds or the format for the Input is wrong");
			}
		}
		
	}
	public static int hex2Dec(String hexString){
		try{
			int finalNum = Integer.parseInt((Integer.toString(Integer.parseInt(hexString, 16), 10)));
			return finalNum;
		}
		catch(NumberFormatException n){
			throw new HexFormatException();
		}
		
	}
	
	public static int bin2Dec(String binString){
		try{
			int finalNum = Integer.parseInt((Integer.toString(Integer.parseInt(binString, 2), 10)));
			return finalNum;
		}
		catch(NumberFormatException n){
			throw new BinaryFormatException();
		}
	
	}
	
	
}

///////////////////////////////////END OF THE HEXBIN DEC CLASS////////////////////////////////////////////////////

class BinaryFormatException extends NumberFormatException{
	private static final long serialVersionUID = 1L;
	public BinaryFormatException(){
		
	}
	
	public BinaryFormatException(String message){
		super(message);
	}
	
}

class HexFormatException extends NumberFormatException{
	private static final long serialVersionUID = 1L;
	public HexFormatException(){
		
	}
	
	public HexFormatException(String message){
		super(message);
	}
}

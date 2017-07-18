package Homework5;

public class Homework5Methods {
	// part 1
	public static String eliminateDuplicates(String str) {
		String returnThis = "";
		int length = str.length();
		char test = 0;
		for(int i = 0; i < length ;){
			test = str.charAt(i);
			str = str.replace(test+"", "");
			length = str.length();
			returnThis += test;
		}
		return returnThis;
	}

	// part 2 int count = line.length() - line.replace(".", "").length();
	public static String getDigits(String s) {
		String returnThis = "";
		s = s.replace("-", "").toUpperCase();	
		char testChar;
		for(int a = 0; a<s.length();a++){
			testChar = s.charAt(a);
			if (testChar >= 65 && testChar <= 67)
				returnThis += "2";
			else if (testChar >= 68 && testChar <= 70)
				returnThis += "3";
			else if (testChar >= 71 && testChar <= 73)
				returnThis += "4";
			else if (testChar >= 74 && testChar <= 76)
				returnThis += "5";
			else if (testChar >= 77 && testChar <= 79)
				returnThis += "6";
			else if (testChar >= 80 && testChar <= 83)
				returnThis += "7";
			else if (testChar >= 84 && testChar <= 86)
				returnThis += "8";
			else if (testChar >= 87 && testChar <= 90)
				returnThis += "9";
			else
				returnThis += testChar;
				
			
		}
		return returnThis;
	}

	// part 3 FIX SOOOOOON
	public static int lowestBasePalindrome(int num) {
		int i = 0;
		
		
		
		
		
		
		
		
		return i;
	}
	public static boolean isPalindrome(String testString){
		boolean flag = true;
		for(int i = 0; i < testString.length()-1;i++){
			flag &= (testString.charAt(i) == testString.charAt((testString.length()-1) - i)) ? true : false;	
		}
		return flag;
	}

	// part 4
	public static int[] interleaveArrays(int[] a1, int[] a2, int stride, int maxElements) {
		int a1l = a1.length;
		int a2l = a2.length;
		if(stride <= 0){
			return null;
		}
		else if(maxElements <= 0){
			return null;
		}
		else if((a1l + a2l) <= maxElements){
			maxElements = a1l + a2l;
		}
		int[] returnThis = new int[maxElements];
		if(stride>a1.length && stride>a2.length){
			stride = a1.length ; 
		}
		
		for(int i = 0; i < maxElements-stride; i+=(2*stride)){
			for(int j = 0; j <= stride-1; j++){
				returnThis[i+j] = a1[(i/(2*stride))+j]; 
			}
		}
		
		for(int i = stride; i<maxElements; i+=(2*stride)){
			for(int j=0 ;j <= stride-1;j++){
				if(stride == maxElements/2 && maxElements%2==0)
					returnThis[i+j] = a2[j];
				else
					returnThis[i+j] = a2[(i/(2*stride))+j];
			}
		}
				
				
		return returnThis;
	}
	
	// part 5
	public static void rotateRight(int[][] matrix, int numCols) {
		
	}	
}
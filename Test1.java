import java.util.regex.Pattern;

public class test 
{

	public static void main(String[] args) 
	{
		int length = 3;
		int[] temp = {1,2,3};
		for(int i = 0 ; i < length; i++)
			System.out.println(temp[i]+"");
		length = 9;
		temp = new int[length];
		for(int i = 0 ; i < length; i++)
			System.out.println(temp[i]+"");
	}
	
	public static String[] getBigWords(String s)
	{
		//number of spaces + 1 = length of array of words
		int arrayLength = ((s.length()-s.replace(" ", "").length())+1);
		String[] words = new String[arrayLength];
		int nums = 0;
		for(int i = 0; i < arrayLength; i++)
		{
			if(s.contains(" "))
			{
				words[i] = s.substring(0, s.indexOf(' ')).trim();
				s = s.substring(s.indexOf(' ')).trim();
				if(words[i].length()>5)
					nums++;
				
			}
			else if(s.length()>1)
			{
				words[i] = s;
				if(s.length()>5)
					nums++;
				
			}
			else
			{
			}
		}
		nums--;
		String[] bigWords = new String[nums];
		for(int i = 0; i < words.length-1;i++)
		{
			if(words[i].length()>5 && (Pattern.matches("[a-zA-Z]+", words[i])))
			{
				bigWords[i] = words[i];
				System.out.println(bigWords[i]);
			}
		}
		return bigWords;
	}
	/**
	 * This is a javadoc comment, which is made by "/**"
	 * @param number
	 * @return
	 */
	public static int reverse(int number){
		String num = ""+number;
		int length = num.length();
		int[] firstNum = new int[length];
		int finalNum = 0;
		for(int i = 0; i <= length-1; i++){
			firstNum[(length-1) - i] = (((int) num.charAt(i)) - 48);
			finalNum += ((firstNum[(length-1) - i]) * Math.pow(10, i));
		}
		
		return finalNum;
	}
	public static void wrap(int[] arr, int n){
		int[] store = new int[arr.length];
		for(int i = 0; i < arr.length;i++){
			store[i] = arr[i];
		}
		for(int i = 0; i<arr.length;i++){
			if((i)<(n-1)){
				arr[i] = store[((i)%n)];
			}
			else{
				arr[i] = store[i+n];
			}
		}
		
	}
	public static boolean isPalindrome(int number){
		String num = ""+number;
		int length = num.length();
		boolean returnThis = true;
		for(int i = 0; i <= length-1; i++){
			if(num.charAt(i)==num.charAt((length-1)-i)){
				returnThis &= true;
			}
			else{
				returnThis &=false;
			}
		}
		
		
		return returnThis;
	}
}

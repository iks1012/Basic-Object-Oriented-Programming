import java.util.regex.Pattern;

public class test {

	public static void main(String[] args) {

        int y = 3; 
        int[] x = {1, 2, 3, 4};

        editnumbersArray(x);
        editnumbersNotArray(y);
        for(;;){
	        System.out.print((int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""); 
	        System.out.print((int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""); 
	        System.out.print((int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""); 
	        System.out.print((int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""); 
	        System.out.print((int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""+(int)(Math.random()+.5)+""); 
	        System.out.println("");
        }
    }

    //this accepts 'x[]' into the 'a[]' parameter.
    public static void editnumbersArray(int[] a){
        a[2] = 9;  //<---why does this one CHANGE the actual x[2] instead of just a[2]?**
    }

    //this accepts 'y' into the 'a' parameter.
    public static void editnumbersNotArray(int a){
        a = 9;  //<--while this one only changes 'a' instead of 'y'?**
    }
	/*public static String removeDupes(String s){
		if(s.length()<=1){
			return s;
		}
	}
	public static String removeDupes(String s, char c){
		if(s.length()==0){
			return "";
			
		}
	}*/
	public static boolean isPalindrome(int[] a,int n,int m){
		
		if((m-n)==0||a.length==0){
			return true;
		}
		else if(a.length == 1){
			return true;
		}
		
			
		else if(a[n] == a[m] ){
			if(a.length > 2){
				return true && isPalindrome(a,n+1,m-1);
			}
			else{
				return true;
			}
		}
		return false;
		
	}
	public static String[] getBigWords(String s){
		//number of spaces + 1 = length of array of words
		int arrayLength = ((s.length()-s.replace(" ", "").length())+1);
		String[] words = new String[arrayLength];
		int nums = 0;
		for(int i = 0; i < arrayLength; i++){
			if(s.contains(" ")){//else if (length>1); else i++;
				words[i] = s.substring(0, s.indexOf(' ')).trim();
				s = s.substring(s.indexOf(' ')).trim();
				if(words[i].length()>5)
					nums++;
				
			}
			else if(s.length()>1){
				words[i] = s;
				if(s.length()>5)
					nums++;
				
			}
			else{
			}
		}
		nums--;
		String[] bigWords = new String[nums];
		for(int i = 0; i < words.length-1;i++){
			if(words[i].length()>5 && (Pattern.matches("[a-zA-Z]+", words[i]))){
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
	public static int insertInt(int a, int i,int n){
		String s = Integer.toString(a);
		String s1 = s.substring(0,i);
		String nS = Integer.toString(n);
		String s2 = s.substring(i);
		String fin = s1+nS+s2;
		a = Integer.parseInt(fin);
		
		
		
		
		return a;
	}
	
}
class TempClass{
	int i = 1;
	public TempClass(int j){
		int i = j;
	}		
}

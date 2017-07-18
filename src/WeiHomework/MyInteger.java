package WeiHomework;



public class MyInteger {
	private int value;
	public MyInteger(int v){
		value = v;
	}
	public int getValue(){
		return value;
	}
	public void setValue(int v){
		value=v;
	}
	public static boolean isPrime(int num){
	    for (int i = 2; i < num; i++) {
	        if (i != num && num % i == 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(MyInteger mI){
		return (mI.getValue()%2==0);
	}
	public static boolean isOdd(MyInteger mI){
		return (mI.getValue()%2!=0);
	}
	public static boolean isPrime(MyInteger mI){
	    for (int i = 2; i < mI.getValue(); i++) {
	        if (i != mI.getValue() && mI.getValue() % i == 0)
	            return false;
	    }
	    return true;
	}
	public static boolean isEven(int n){
		return (n%2==0);
	}
	public static boolean isOdd(int n){
		return (n%2!=0);
	}
	public boolean equals(int n){
		return (value == n);
	}
	public boolean equals(MyInteger mI){
		return (value == mI.getValue());
	}
	public static int parseInt(String s){
		s=s.trim();
		int finalNum = -1;
		for(int i = 0; i < s.length(); i ++){
			finalNum += (s.charAt(i)-'0')*(Math.pow(10, s.length()-i)) ; 
		}
		
		
		
		
		return finalNum;
	}
	public String toString(){
		String s = "";
		s = 
		"The Number you entered is "+value+
	"\n The number "+((isEven(value)) ? " is even":" is odd")+
	"\n The number is "+(isPrime(value)?"prime":"not prime");
		return s;		
	}
	public String toString(MyInteger mI){
		String s = "";
		s = 
		"The Number you entered is "+mI.getValue()+
	"\n The number "+((mI.isEven(mI.getValue())) ? " is even":" is odd")+
	"\n The number is "+(mI.isPrime(mI.getValue())?"prime":"not prime");
		return s;		
	}
}

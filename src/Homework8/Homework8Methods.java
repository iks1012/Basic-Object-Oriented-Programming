 package Homework8;

import java.util.ArrayList;
import java.util.Arrays;


public class Homework8Methods {
	
	public static int i = 0;
	public static int turns;
	public static int loop0 = 0;
	public static int loop1 = 0;
	public static int loop2 = 0;
	public static int size;
	public static ArrayList<ArrayList<Integer>> convThis;
	public static ArrayList<int[]> returnThis;
	public static ArrayList<Integer> sendThis;
	
	
	public static int[] temp;
	public static int[] b;
	// part 1
	public static int findTimes10(int[] nums) {
		if(nums.length == 1){
			return -Integer.MAX_VALUE; //can only beat it if the array is greater then MAX_INT, which isnt possible
		}
		else if(nums[0]*10 == nums[1]){
			return 0;
		}
		else{
			int[] temp = new int[nums.length-1];
			System.arraycopy(nums, 1, temp, 0, nums.length-1);
			if(findTimes10(temp)>=0){
				return 1+findTimes10(temp);
			}
		}

		return -1;
	}

	
	
	// part 2
	public static void replaceMult5(int[] nums, int newVal) {
		if(nums[i] % 5==0){
			nums[i] = newVal;
		}
		if(i<nums.length-1){
			i++;
			replaceMult5(nums,newVal);
		}
		else{
			i=0;
		}
	}

	// part 3
	public static ArrayList<int[]> permuteArray(int[] a) {
		//implement ArrayList then convert to Array
		size = a.length;
		b = new int[size];
		System.arraycopy(a, 0, b, 0, size);
		returnThis = new ArrayList<int[]>();
		sendThis = new ArrayList<Integer>();
		loop0();
		convThis = permute(sendThis);
		loop1(); //converts [] to <>
		return returnThis;
		
	}
	
	public static void loop0(){
		if(loop0 < size){
			loop0++;
			int tempVar = b[loop0-1];
			sendThis.add(tempVar);
			loop0();
		}
		else{
			loop0 = 0;
		}
	}
	
	
	public static void loop1(){ // ladies and Gentlemen that are inspecting my code
		if(loop1  < convThis.size()){ //I present
			loop1++;				// the recursion loop
			temp = new int[size];
			loop2();
			returnThis.add(temp);
			loop1();
		}
		else{
			loop1 = 0; // resets for next permute() call
		}
	}
	public static void loop2(){
		if(loop2 < size){//the boolean statement that usually goes in the for loop
			loop2++; //change that usually is in the else of the for loop, 
			temp[loop2-1] = (convThis.get(loop1-1)).get(loop2-1);
			//since i do it first, I use loop2-1, which  lets me make the increment
			loop2();// before the recursive call, which renters the loop
			//because the condition is true
		}
		else{
			loop2=0; // resets for next method call call
		}
	}
	
	
	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		if(list.size()==0){
			res.add(new ArrayList<Integer>());
			return res;
		}
		int fE = list.remove(0);
		ArrayList<ArrayList<Integer>> oP = permute(list); //recursion
		for(ArrayList<Integer> perms : oP){
			for(int i = 0; i <= perms.size(); i++){
				ArrayList<Integer> temp = new ArrayList<Integer>(perms);
				temp.add(i,fE);
				res.add(temp);
			}
		}
		return res;
	}
	
	
	
	
	// part 4
	public static String[] mobius(String s1, String s2) {
		if(s1==null && s2 == null){
			return new String[0];
		}
		else if ((s1 == null)){
			s1 = "";
		}
		else if(s2 == null){
			s2 = "";
		}
		
		
		String s3 = s1+s2;
		String[] s = new String[s3.length()];
		int i = 0;
		mobius(s, s3, i);
		return s;
	}
	public static void mobius(String[] s, String s3, int i) {
		String temp = s3;
		if(i<s.length && s3!=null){
			s[i] = temp;
			temp = s3.substring(1)+s3.charAt(0);
			mobius(s,temp,i+1);
		}
		else{
			return;
		}
		
		
	}
	
	// part 5
	public static int teddy(int initial, int goal, int increment) {
		if (turns >=10) {
			turns = 0;
			return turns;
		}
	
		if (!bears(initial, goal, increment, turns)) {
			turns++;
			teddy(initial, goal, increment);
		} 
		else {
			return turns;
		}
		if (turns == 0){
			return -1;
		}
			

		return turns;

	}

	public static boolean bears(int initial, int goal, int increment, int n) {
		if (initial == goal) {
			return true;
		} 
		else if (n == 0) {
			return false;
		} 
		else if (bears(initial - increment, goal, increment, n - 1)) {
			return true;
		} 
		else if (bears(initial + increment, goal, increment, n - 1)) {
			return true;
		} 
		else if ((initial % 2 == 0) && bears(initial / 2, goal, increment, n - 1)) {
			return true;
		} 
		else if ((initial % 2 == 0) && bears(initial / 2 + initial, goal, increment, n - 1)) {
			return true;
		} 
		else {
			return false;
		}
	}

		
}
	


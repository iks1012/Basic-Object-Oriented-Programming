import java.io.*;
import java.util.*;
public class Roman {
    public static void main(String[] args) {
        readWriteFile();
    } 
    public static void readWriteFile() {
        try {
           Scanner fIn = new Scanner(new File("roman.txt"));
           BufferedWriter fOut = new BufferedWriter(new FileWriter("output.txt"));
           int temp;
           String line;          
           while (fIn.hasNext()) {
               line = fIn.nextLine();
               temp = toNum(line);
               String answer;
               if((temp>1000000)){
            	   answer =("Wrong Format");
               }
               else{
            	   answer = (""+temp);
               }
               fOut.write(line + " = " + answer);
               fOut.newLine();
           }
           fOut.close();
           fIn.close();
        }
        catch (IOException e) {
           System.out.println("File error"); 
        }
    }
    
    public static int toNum(String roman) {
    	int finalNum = 0;
    	int[] nums = toArrayOfNums(roman); //what this method does is self-explanatory
    	int tempNum = 0;
    	for(int i = 0; i < nums.length; i++){
    		tempNum+=nums[i];//since nothing happened below, the next value, now at the index of i, is added to tempNum
    		if(i != nums.length-1){
    			if(nums[i] == nums[i+1]){//if the current and next values are the same nothing happens
    				//tempNum += nums[i+1];
    			}
    			else if(nums[i] < nums[i+1]){
    				nums[i+1] = (nums[i+1]-tempNum);//if the condition is true, then the numbers must be subtracted and that is what is happening in the array
    				tempNum = 0;//temp num is reset
    			}
    			else{
					finalNum+=tempNum;//if the term after is less (Only remaining condition), 
					tempNum = 0;// 		then the current term is just added... and then the future terms will be too
    				
    			}
    		}
    		else{
    			if(nums[i] > nums[i-1]){
    				finalNum += nums[i];
    			}
    			else{
    				finalNum += (tempNum + nums[i]);
    			}
    		
    		}
    		
    	}
    	if(nums[nums.length-1]==1){
			finalNum--;
		}
    	return finalNum;
    }
    
    public static int[] toArrayOfNums(String roman){//This method basically returns the array of actual values
    	int[] num = new int[roman.length()];		//so MMM would return {1000,1000,1000}
    	char temp;
    	int prec = 0; //prec is the precedence
        for (int i = 0; i < roman.length(); i++){
        	temp = roman.charAt(i);
        	if(temp=='M'){
        		prec=1000;
        	}
        	else if(temp=='D'){
        		prec=500;
        	}
        	else if(temp=='C'){
        		prec=100;
        	}
        	else if(temp=='L'){
        		prec=50;
        	}
        	else if(temp=='X'){
        		prec=10;
        	}
        	else if(temp=='V'){
        		prec=5;
        	}
        	else if(temp=='I'){
        		prec=1;
        	}
        	else{
        		prec = 1000000;
        	}
        	
        	//prec = (temp=='M')?(prec=1000):((temp=='D')?(prec=500):((temp=='C')?(prec=100):((temp=='L')?(prec=50):((temp=='X')?(prec=10):((temp=='V')?(prec=5):((temp=='I')?(prec=1):(prec=1000000)))))));
        	num[i] = prec;
        	//System.out.print(num[i]+" ");
        }
        //System.out.println();
        return num;
    }
    
}

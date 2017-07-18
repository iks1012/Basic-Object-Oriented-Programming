package Homework7;

import java.io.*;
import java.util.Scanner;

public class ReformatCode {
	public static void main(String[] args) throws IOException{
		File file2 = new File(args[1]);
		String tempS = finalize(fileToString(args[0]));
		try(PrintWriter out = new PrintWriter(file2);){
			out.print(tempS);
		}
	}
	
	public static String finalize(String str){
		return str.replaceAll("\\r\\n\\s*\\{"," \\{");
	}
	
	public static String fileToString(String f) throws IOException {
	    BufferedReader bR = new BufferedReader(new FileReader(f));
	    String s = null;
	    StringBuilder  sB = new StringBuilder();
	    String ls = System.getProperty("line.separator");
	    try {
	        while((s = bR.readLine()) != null) {
	            sB.append(s);
	            sB.append(ls);
	        }

	        return sB.toString();
	    }
	    finally {
	        bR.close();
	    }
	}
	
}


package Review;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIOPractice {
	public static void main(String[] args){
		File f = new File("input2.txt");
		
		try(PrintWriter out = new PrintWriter(f);){
			out.println("Deez Nuts");
		}
		catch(Exception e){
			
		}
		
		try {
			
			
			Scanner in = new Scanner(f);
			
			while(in.hasNext()){
				String line = in.nextLine();
				System.out.println(line  );
			}
			in.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("gg");
		}
		
	}
}

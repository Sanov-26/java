package java_day5;

import java.io.*;

public class Buffer_Reader {
	public static void main(String[] args) {
		try {
			BufferedReader r1=new BufferedReader(new FileReader("C:\\Users\\WELCOME\\eclipse-workspace\\Add_on\\src\\java_day5\\buffer.txt"));
		    String line;
		    System.out.println("Reading file");
		    while ((line = r1.readLine()) != null) {
		    	System.out.println(line);
		    }
		    r1.close();
		   }catch (IOException e) {
			   System.out.println("Error reading file :"+e.getMessage());
		   }
		
	}

}
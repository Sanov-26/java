package java_day5;

import java.io.*;

public class File_Writer {
	public static void main(String[] args) {
		try {

            // Writing data to file

             FileWriter w1 = new FileWriter("C:\\Users\\WELCOME\\eclipse-workspace\\Add_on\\src\\java_day5\\example.txt") ;

                w1.write("Hello Java !");

                w1.close();

                System.out.println("Data Successfully written to file");
	}catch (IOException e) {

        System.out.println("Error: " + e.getMessage());

}
	}
}
package java_day5;
import java.io.*;

class File_Creation {
	public static void main(String[] args) throws IOException {
		File obj = new File ("src/Java_day5/demo.txt");
		obj.createNewFile();
		System.out.println("File Created");
	}

}

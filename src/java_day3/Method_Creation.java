package java_day3;
import java.util.*;
public class Method_Creation {
	public static int add(int a,int b) {
		return a+b;
		
	}
	public static void main(String[]args) {
		
		//System.out.println(add(100,200));
		
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.println("Enter a value:");
			int inp1 = s1.nextInt();
			int inp2 = s1.nextInt();
			System.out.println(add(inp1,inp2));
		}
	}

}

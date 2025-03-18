package java_day2;
import java.util.*;
public class User_input {
	public static void main(String[]args)
	{
		try (Scanner s1 = new Scanner(System.in)) {
			System.out.print("Enter a name");
			String name = s1.nextLine();
			System.out.println(name);
		}
	}

}

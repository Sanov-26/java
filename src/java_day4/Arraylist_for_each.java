package java_day4;
import java.util.*;

public class Arraylist_for_each {
	public static void main(String[] args) {
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		
		System.out.println(a2.get(0));       // gets the index value
		
		System.out.println(a2.set(1, 2000));  // set the given value to the specified index value
		
		System.out.println(a2.get(1));
		
		System.out.println(a2.remove(0));
		
		System.out.println(a2.get(0));
		
		System.out.println("*******");
		
		for(int i:a2) {                 // print the values line by line 
		System.out.println(i);
		}
	}
}


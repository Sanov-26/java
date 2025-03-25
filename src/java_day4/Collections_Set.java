package java_day4;
import java.util.*;

public class Collections_Set {
	public static void main(String[] args) {
		//HashSet, TreeSet
		
		HashSet<String> s1= new HashSet<>();  // does not allow duplicate value in the set 
		s1.add("A");
		s1.add("B");
		s1.add("A");
		System.out.println(s1);
		
		TreeSet<Integer> t1= new TreeSet<>(); // sort the values in the list 
		t1.add(100);
		t1.add(200);
		t1.add(10);
		System.out.println(t1);
	}
}
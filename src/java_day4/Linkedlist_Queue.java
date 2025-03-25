package java_day4;

import java.util.*;

public class Linkedlist_Queue {
	public static void main(String[] args) {
		Queue <Integer> q=new LinkedList<>();
		q.add(100);
		q.add(200);
		System.out.println(q);
		
		System.out.println(q.peek()); // takes the head value from the list (index 0)
	}
}
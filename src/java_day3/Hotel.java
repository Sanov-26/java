package java_day3;
import java.util.*;

class order {
	String Recipe;
	int Order,Quantity;
	int Rate=50;
	
	
	void get() {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter your Order Id:");
			Order=s.nextInt();
			System.out.println("Enter the recipe:");
			Recipe=s.next();
			System.out.println("Enter the quantity:");
			Quantity=s.nextInt();
		}

		}
	
	void display() {
		System.out.println("Enter your order:");
		System.out.println("-------------------");
		System.out.println("Your orderId:"+Order);
		System.out.println("Your recipe:"+Recipe);
		System.out.println("Your Quantity:"+Quantity);
		System.out.println("Your Price:"+Rate);
		System.out.println("Thank you. Visit again!");
		
	}
}

public class Hotel {
	public static void main(String[]args) {
		order a=new order();
		a.get();
		a.display();
	}
}

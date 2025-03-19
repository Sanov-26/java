package java_day3;
import java.util.*;
class Book1 {
	int BookId;
	String Title;
	String Author;
	double Price;
	
	Book1(int BookId, String Title, String Author, double Price){
		this.BookId=BookId;
		this.Title=Title;
		this.Author=Author;
		this.Price=Price;
	}
	
	void display() {
		System.out.println("The Book ID number is:"+BookId);
		System.out.println("The Title of the Book is:"+Title);
		System.out.println("The Name of the Author is:"+Author);
		System.out.println("The Price of the Book is:"+Price);
	}
}
public class Book {
	public static void main(String[]args) {
	Book1 b=new Book1(24,"Love hypothesis","Ali Hazelwood",200);
	Book1 b2=new Book1(25,"Java","Balagurusami",500);
	Book1 b3=new Book1(26,"Python","Kantha",300);
	b.display();
	b2.display();
	b3.display();
	
}
}
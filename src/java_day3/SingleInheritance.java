package java_day3;
import java.util.*;

class Animal{
	void sound() {
		System.out.println("Animals make sounds");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks");		
	}
}

public class SingleInheritance {
	public static void main(String[]args) {
		Dog d1 = new Dog();
		d1.sound();
		d1.bark();		
	
	}

}

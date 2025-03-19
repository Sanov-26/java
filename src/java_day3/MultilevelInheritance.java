package java_day3;
class Birds1{
	void fly() {
		System.out.println("Birds can fly");
	}
}

class Parrot1 extends Birds1{
	void sing() {
		System.out.println("Parrot can sing");		
	}
}

class Duck1 extends Parrot1{
	void swim() {
		System.out.println("Duck can swim");
	}
}
public class MultilevelInheritance {
	public static void main(String[]args) {
		Duck1 p=new Duck1();
		p.fly();
		p.sing();
		p.swim();
	}

}

package java_day3;

class Cal {
	int inp1,inp2,total;
	
	void add() {
		total=inp1+inp2;
		System.out.println("Addition of 2 number is:"+total);
	}
	
	void sub() {
		total=inp1-inp2;
		System.out.println("Subraction of 2 number is:"+total);
	}
	
	void mul() {
		total=inp1*inp2;
		System.out.println("Multiplication of 2 number is:"+total);
	}
	
	void div() {
		total=inp1/inp2;
		System.out.println("Division of 2 number is:"+total);
	}
}


public class Calculator {
	public static void main(String[]args) {
		Cal c = new Cal();
		c.inp1 =40;
		c.inp2 = 30;
		c.add();
		c.sub();
		c.mul();
		c.div();
		
	}
}

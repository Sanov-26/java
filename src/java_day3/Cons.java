package java_day3;

class Cons1 {
	String name, color;
	Cons1(){
		name="doms";
		color="blue";
		
	}
	
	Cons1(String color){
		this.color= color;
		
	}
	
	void display() {
		System.out.println("The pen name is:"+name);
		System.out.println("The color od the pen is:"+color);
		
	}
}
public class Cons {
	public static void main(String[]args) {
		Cons1 p=new Cons1();
		p.display();
}
	
}

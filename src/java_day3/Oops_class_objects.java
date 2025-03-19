package java_day3;
class Student{
	String name = "priya";
	int rollNum = 223225;
	String dept = "CS";
	void displayData() {
		System.out.println("My name is: "+name);
		System.out.println("Roll Number: "+rollNum);
		System.out.println("Deaprtment: "+dept);
	}
	public void print() {
		// TODO Auto-generated method stub
		
	}
}
public class Oops_class_objects {
	public static void main(String[]args) {
		Student obj = new Student();
		obj.displayData();
		obj.print();
	}

}

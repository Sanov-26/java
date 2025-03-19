package java_day3;

class Student1{
	public String name = "Raj";
	private int age = 20;
	protected String grade = "A";
	String school = "ABC School";
	 public void displayInfo() {
		 System.out.println("Name: "+ name);
		 System.out.println("Age: "+age);
		 System.out.println("Grade: "+grade);
		 System.out.println("School: "+grade);
	 }
}
public class AccessModifier {
	public static void main(String[]args) {
		Student1 s1 = new Student1();
		s1.displayInfo();
		
		System.out.println("Public name: "+s1.name);
		System.out.println("Default School: "+s1.school);
		
		//System.out.println("Private Age: "+Student1.age);
		//System.out.println("Protected Grade: "+Student1.grade);
	}

}

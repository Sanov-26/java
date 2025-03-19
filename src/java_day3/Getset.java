package java_day3;
 class Data1{
	 private String name;
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 if(name != null&& !name.isEmpty()) {
			 this.name = name;
		 }else {
			 System.out.println("Invalid name!");
		 }
	 }
 }
public class Getset {
	public static void main(String[]args) {
		Data1 s1 = new Data1();
		s1.setName("Chitra");
		System.out.println("Student name: " + s1.getName());
	}

}

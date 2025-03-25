package java_day4;

public class Exception_Ex2 {
	static void checkAge(int age) {
		if (age < 18) {
			throw new IllegalArgumentException ("Age must be 18 or older");
		}
		System.out.println("Access granted");
	}
	public static void main(String[] args) {
		try {
			//checkAge(15);
			checkAge(20);
		}catch(IllegalArgumentException e) {
			System.out.println("Caught Exception: "+e.getMessage());
		}
	}
}
package java_day4;

//Step 1: Define the custom exception
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

public class Custom_Exceptions {
 // Step 2: Method to check age
 static void checkAge(int age) throws InvalidAgeException {
     if (age < 18) {
         throw new InvalidAgeException("Age must be 18 or older");
     }
     System.out.println("Age is valid");
 }

 public static void main(String[] args) {
     try {
         
         // checkAge(15); // This will throw an exception
         checkAge(20); // This will not throw an exception
     } catch (InvalidAgeException e) { // Catch the correct custom exception
         System.out.println("Caught Exception: " + e.getMessage());
     }
 }
}
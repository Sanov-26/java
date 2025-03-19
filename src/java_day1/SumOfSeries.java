package java_day1;
import java.util.Scanner;
public class SumOfSeries {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			// Get the value of n from the user
			System.out.print("Enter the numbers (n): ");
			int n = s.nextInt();
			int sum = 0;

			// Loop to calculate the sum of the series

			for (int i = 1; i <= n; i++) {
			    sum += i; // Add each term to the sum
			}
			System.out.println("The sum of the series " + n + " is: " + sum);
		}
    }
}

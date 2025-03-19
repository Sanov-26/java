package java_day1;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
			System.out.print("Enter the number of rows: ");
			int rows = s.nextInt();
			System.out.print("Enter the number of columns: ");
			int columns = s.nextInt();
			int[][] matrix = new int[rows][columns];
			System.out.println("Enter the elements of the matrix:");
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < columns; j++) {
			        System.out.print("Element [" + i + "][" + j + "]: ");
			        matrix[i][j] = s.nextInt();
			    }
			}
			System.out.println("The entered matrix is:");
			for (int i = 0; i < rows; i++) {
			    for (int j = 0; j < columns; j++) {
			        System.out.print(matrix[i][j] + " ");
			    }
			    System.out.println(); 
			}
		}
    }

}

package java_day2;
public class Matrix {
public static void main(String[]args) {
	int[][] m = new int[2][3];
	   m [0][0] = 1; m [0][1] = 2; m [0][2] = 3;
	   m [1][0] = 4; m [1][1] = 5; m [1][2] = 6;
	   
	   for (int i =0; i < 2; i++) {
		   for (int j = 0; j < 3; j++) {
			   System.out.print(m [i][j] + " ");
		   }
		   System.out.println();
	   }
}
}

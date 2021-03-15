import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.print("Sum of the elements in the major diagonal is " + sumMajorDiagonal(matrix));

    }

    public static double sumMajorDiagonal(double[][] m) {
        double sum = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = i; j <= i; j++) {
                sum += m[i][j];
            }
        }


        return sum;
    }


}

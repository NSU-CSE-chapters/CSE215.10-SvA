import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        if (isMarkovMatrix(matrix)) {
            System.out.println("It is a Markov matrix");
        } else System.out.println("It is not a Markov matrix");


    }

    public static boolean isMarkovMatrix(double[][] m) {


        double sum = 0;
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            sum = 0;
            for (int j = 0; j < m.length; j++) {
                if (m[j][i] < 0) {
                    return false;
                }

                sum += m[j][i];

            }
            if (sum != 1.0) {
                return false;


            }
        }
        return true;
    }
}

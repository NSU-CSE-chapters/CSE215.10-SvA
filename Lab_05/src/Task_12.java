import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows and columns of the array: ");

        Scanner input = new Scanner(System.in);

        int row = input.nextInt();
        int col = input.nextInt();

        double[][] arr = new double[row][col];

        System.out.println("Enter the array:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = input.nextDouble();
            }
        }
        System.out.println();
        int[] loc = locateLargest(arr);
        System.out.printf("The location of the largest element is at (%d, %d)%n", loc[0], loc[1]);


    }

    public static int[] locateLargest(double[][] a) {
        double max = a[0][0];
        int[] location = new int[]{0, 0};

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }
        return location;
    }
}

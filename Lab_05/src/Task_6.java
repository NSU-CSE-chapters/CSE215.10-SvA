import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        System.out.print("enter ten double values: ");
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];

        // number user input
        for (int i = 0; i <numbers.length ; i++) {
                numbers[i] = input.nextDouble();
        }

        System.out.println("avg = "+average(numbers));


    }

    public static int average(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }

        return sum/ array.length;
    }

    public static double average(double[] array){
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum/array.length;
    }
}

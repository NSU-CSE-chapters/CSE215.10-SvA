import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        System.out.print("enter n : ");

        int n = input.nextInt();

        int[] arr = new int[n];

        int[] number = userInput(arr);

        printArr(number);
//
//        double avg = getAvg(number);
        System.out.println();
//        System.out.println("the avg is " + avg);

        System.out.println("after sorting: ");
        int[] sorted = sortArr(number);
        printArr(sorted);

    }

    public static int[] userInput(int[] input) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }


        return input;
    }



    public static void printArr(int[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

//    public static double getAvg(int[] arr) {
//        int sum = 0;
//
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        return (double) sum / arr.length;
//    }

    public static int[] sortArr(int[] input) {
//        int[] init = new int[input.length];
        int temp = 0;
//        for (int i = 0; i < input.length; i++) {
//            init[i] = input[i];
//        }
        // int[] sortArr = Arrays.copyOf(array, array.length);

        for (int i = 0; i < input.length; i++) {
            for (int j = 1; j < (input.length - i); j++) {
                if (input[j] > input[j - 1]) {

                    temp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = temp;

                }

            }

        }
        return input;
    }
}

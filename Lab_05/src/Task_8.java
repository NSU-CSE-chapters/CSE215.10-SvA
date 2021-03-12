import java.util.Scanner;

public class Task_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1: ");

        int a = input.nextInt();
        int[] list1 = new int[a];
        for (int i = 0; i < a; i++) {
            list1[i] = input.nextInt();
        }
        System.out.print("Enter list2: ");
        int b = input.nextInt();
        int[] list2 = new int[b];


        for (int i = 0; i < b; i++) {
            list2[i] = input.nextInt();
        }

//        sorting(list1);
        if (equals(list1, list2)) {
            System.out.println("Two lists are identical");
        } else System.out.println("Two lists are not identical");


    }

    public static boolean equals(int[] list1, int[] list2) {
        sorting(list1);
        sorting(list2);
        if (list1.length != list1.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }

        return true;


    }


    public static void sorting(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}












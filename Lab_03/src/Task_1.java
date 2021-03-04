import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is 0: ");

//        int n = input.nextInt();

        int n;


        int pos = 0, neg = 0;
        double total = 0, avg;


        while ((n = input.nextInt()) != 0) {
            if (n > 0) {
                pos++;
            } else neg++;
            total += n;


        }

        System.out.println("The number of positives is " + pos);
        System.out.println("The number of negetives is " + neg);
        System.out.println("The total is " + total);
        avg = total / (pos + neg);
        System.out.println("The average is " + avg);
    }
}

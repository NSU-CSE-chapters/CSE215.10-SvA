import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = input.nextInt();

        int[] prime = new int[n];

        int index = 0;

        for (int i = 2; index < n; i++) {
            if (isPrime(i)) {
                prime[index] = i;
                index++;

            }
        }

        System.out.println("first " + n + " primes are: ");
        int count = 0;
        for (int i = 0; i < prime.length; i++) {
            System.out.printf("%5d", prime[i]);
            count++;
            if (count % 10 == 0) {
                System.out.println("");
            }
        }


//        int count =0;
//
//        int i=2;
//        while (count<50){
//            if (isPrime(i)){
//                count++;
//                System.out.print(i+"   ");
//                if (count%10==0){
//                    System.out.println();
//                }
//            }
//
//            i++;
//        }
//
//    }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}

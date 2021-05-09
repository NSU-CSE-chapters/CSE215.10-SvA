package nsu.lab11;

import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i=1;

        while (scanner.hasNext()){
            String name = scanner.nextLine();
            System.out.println(i+" "+name);
            i++;
        }


//        System.out.println(scanner.delimiter());
//            int a = 5;
//            int b = 0;
//
//            if (b!=0){
//                System.out.println(a/b);
//            }else throw new  ArithmeticException("divisor can not be zero");
    }
}

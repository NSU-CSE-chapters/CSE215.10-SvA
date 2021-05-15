package nsu.lab11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) throws IOException {
        File file = new File("Exercise12_15.txt");
//        if (file.exists()) {
//            System.out.println("File already exists");
//            System.exit(0);
//        }
        try{
            PrintWriter printWriter  = new PrintWriter(file);

            for (int i = 0; i < 100; i++) {
                int random;
                random  =(int) (Math.random() * 100)+1;
                printWriter.print(random+" ");
            }
            printWriter.close();
        }catch (Exception e){
            System.out.println(e);
        }

        ArrayList<Integer> integers = new ArrayList<>();
        try {
            File file1 = new File("Exercise12_15.txt");
            Scanner scanner = new Scanner(file1);
            while (scanner.hasNext()){
                int n = scanner.nextInt();
                integers.add(n);

            }
            scanner.close();
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Increasing order: ");
        Collections.sort(integers);
        System.out.println(integers.toString());

    }
}

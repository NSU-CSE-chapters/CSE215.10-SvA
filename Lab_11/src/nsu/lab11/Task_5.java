
package nsu.lab11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the file of the scores: ");
        File file = new File(input.nextLine());


        if (!file.exists()){
            System.out.println("file doesn't exists");
            System.exit(2);
        }

        double total = 0, avg;
        int count =0;

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                total+=scanner.nextInt();
                count++;

            }
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println("total scores: "+total);
        System.out.println("avarage scores: "+total/count);



    }
}

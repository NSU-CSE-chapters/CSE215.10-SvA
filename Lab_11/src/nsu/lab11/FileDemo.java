package nsu.lab11;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("data.txt");

        file.createNewFile();

        if (!file.exists()){
            System.exit(0);
        }

        Writer out;
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print("Fahim ");
        printWriter.print(50+"\n");
        printWriter.print("Muntashir ");
        printWriter.print(10+"\n");

        printWriter.close();

        try {
            File file1 = new File("data.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()){
                String name = input.next();
                String id = input.next();

                System.out.println("Name= "+name+" ID= "+id);
            }
            input.close();


        }catch (Exception e){
            System.out.println(e);
        }


    }
}

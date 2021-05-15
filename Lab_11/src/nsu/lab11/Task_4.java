package nsu.lab11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) throws IOException {
        try {
            File file = new File("task4.txt");
            file.createNewFile();
        } catch (Exception e) {
            System.out.println(e);
        }

        long charCount = 0L;
        int lines = 0;
        int words = 0;
        try {
            File file = new File("data.txt");
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String s = input.nextLine();
                charCount += s.length();
                lines += 1;
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }


            }
            System.out.println("File " + file.getName() + " has \n" + charCount + " character\n" + words + " words\n" + lines + " lines\n");

        }catch (Exception e){
            System.out.println(e);
        }



    }
}

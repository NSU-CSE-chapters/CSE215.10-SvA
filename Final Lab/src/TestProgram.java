
import java.io.*;
import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) throws UnresolvedInputException, IOException {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: 7th digit of your NSU ID : "); // 2021183 = 3
        int x = input.nextInt();
        Animal[] elephants = new Elephant[x];
        Animal[] giraffes = new Giraffe[x];


        // user input
        try {
            for (int i = 0; i < x; i++) {
                System.out.println("Enter the " + (i + 1) + " Elephant's color, size and species: ");
                elephants[i] = new Elephant(input.next(), input.nextInt(), input.next());

                System.out.println("Enter the " + (i + 1) + " Giraffe's color, size and species: ");

                giraffes[i] = new Giraffe(input.next(), input.nextInt(), input.next());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        // print the toString method and overriden equals method
        for (int i = 0; i < x; i++) {
            System.out.println("Elephant " + (i + 1) + "=  " + elephants[i].toString());
            System.out.println("equals= " + elephants[i].equals(elephants[0]));

            System.out.println("Giraffe " + (i + 1) + "=  " + giraffes[i].toString());
            System.out.println("equals= " + giraffes[i].equals(giraffes[0]));
        }


        // saving information into a file
        File file = new File("info.txt");
        file.createNewFile();

        if (!file.exists()) {
            System.exit(0);
        }


        Writer out;
        PrintWriter printWriter = new PrintWriter(file);

        try {

            for (int i = 0; i < x; i++) {
                printWriter.println(elephants[i].toString());
                printWriter.println(giraffes[i].toString());
            }
        } catch (Exception e) {
            System.out.println(e);
        }


        printWriter.close();


    }
}





package com.nsu;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int computer = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");

        int myChoice = input.nextInt();


        System.out.print("The computer is ");
        switch (computer) {
            case 0:
                System.out.print("scissor. ");
                break;
            case 1:
                System.out.print("rock. ");
                break;
            case 2:
                System.out.print("paper. ");
                break;
        }
        System.out.print("You are ");
        switch (myChoice) {
            case 0:
                System.out.print("scissor");
                break;
            case 1:
                System.out.print("rock");
                break;
            case 2:
                System.out.print("paper");
                break;
        }


        if (computer == myChoice) {
            System.out.print(" too. It is a draw");
        } else {

            boolean win = (myChoice == 0 && computer == 2) ||
                    (myChoice == 1 && computer == 0) ||
                    (myChoice == 2 && computer == 1);

            if (win){
                System.out.println(". You won");
            }else System.out.println(". You lose");
        }


    }
}

package com.something;

public class Task_3 {
    public static void main(String[] args) {
        Account ac = new Account(1122, 20000);
        ac.setAnnualInterestRate(4.5);
        ac.withdraw(2500.0);
        ac.deposit(3000.0);


        System.out.println("balance: " + ac.getBalance() + " ,monthly interest: "
                + ac.getMonthlyInterest() + " ,date: " + ac.getDateCreated());


    }
}

package com.something;

public class BankAccount {
    String accNo;
    double balance;
    String customerName;
    String email;
    String number;

    public BankAccount() {
        this("kjhuk", 1000.0, "default name", "default mail");

        System.out.println("default bankaccount called");
    }

    BankAccount(String accNo, double balance, String email, String customerName) {
        System.out.println("constructor account called");
        this.accNo = accNo;
        this.balance = balance;
        this.email = email;
        this.customerName = customerName;

    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccNo() {
        return accNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }


}

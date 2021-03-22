package com.something;

public class VipCustomer {
    String customerName;
    int creditLimit;
    String customerEmail;

    VipCustomer(){
        this("default name", 111, "default email");
        System.out.println("1st constructor called");
    }

    public VipCustomer(String customerName, int creditLimit) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
    }

    public VipCustomer(String customerName, int creditLimit, String customerEmail) {
        System.out.println("3rd constructors called");
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }
}

package com.cse215;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        if (this.value % 2 == 0) {
            return true;
        } else return false;
    }

    public boolean isOdd() {
        if (this.value % 2 != 0) {
            return true;
        } else return false;
    }

    public boolean isPrime() {
        for (int i = 2; i < this.value; i++) {
            if (this.value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(int value) {
        if (value % 2 == 0) {
            return true;
        } else return false;
    }

    public static boolean isOdd(int value) {
        if (value % 2 != 0) {
            return true;
        } else return false;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }


    public boolean equals(int value) {
        if (this.value == value) {
            return true;
        } else return false;

    }

    public boolean equals(MyInteger value) {
        return value.equals(this.value);
    }

    public static int parseInt(char[] chars) {
        int sum = 0;

        for (char i : chars) {
            sum += Character.getNumericValue(i);
        }

        return sum;

    }

    public static int parseInt(String value) {
        return Integer.parseInt(value);
    }


}

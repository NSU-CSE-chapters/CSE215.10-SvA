package nsu.helpingHand;

import java.util.concurrent.CompletableFuture;

public class Complex {
    double real;
    double imaginaryPart;

    public Complex(double real, double imaginaryPart) {
        this.real = real;
        this.imaginaryPart = imaginaryPart;
    }


    public Complex sum(Complex c1, Complex c2) {

        Complex temp = new Complex(0.0, 0.0);
        temp.real = c1.real + c2.real;
        temp.imaginaryPart = c1.imaginaryPart + c2.imaginaryPart;

        return temp;

    }

    public Complex multiplication(Complex c1, Complex c2) {
        Complex temp = new Complex(0.0, 0.0);
        temp.real = c1.real * c2.real;
        temp.imaginaryPart = c1.imaginaryPart * c2.imaginaryPart;

        return temp;
    }
}

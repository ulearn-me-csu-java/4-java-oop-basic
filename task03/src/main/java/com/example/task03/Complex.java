package com.example.task03;

public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real=real;
        this.imaginary=imaginary;
    }

    public Complex sum(Complex other) {
        return new Complex(
                real+other.real,
                imaginary+other.imaginary
        );
    }

    public Complex multiply(Complex other) {
        return new Complex(
                real*other.real-imaginary*other.imaginary,
                real*other.imaginary+imaginary*other.real
        );
    }

    public String toString() {
        return real+" + "+imaginary+"i";
    }
}


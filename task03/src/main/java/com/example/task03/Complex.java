package com.example.task03;

public class Complex {
    private double real; //вещественная часть
    private double imag; //мнимая часть

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imag * other.imag;
        double newImag = this.real * other.imag + this.imag * other.real;
        return new Complex(newReal, newImag);
    }

    @Override
    public String toString() {
        if (imag < 0) {
            return real + " - " + (-imag) + "i";
        } else {
            return real + " + " + imag + "i";
        }
    }
}

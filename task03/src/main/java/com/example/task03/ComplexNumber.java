package com.example.task03;

public class ComplexNumber {
    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(
                this.real + other.real,
                this.imaginary + other.imaginary);
    }

    // (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        return new ComplexNumber(
                this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + (-imaginary) + "i";
        }
        return real + " + " + imaginary + "i";
    }
}
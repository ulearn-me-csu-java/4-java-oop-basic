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

    public ComplexNumber add(ComplexNumber number) {
        return new ComplexNumber(real + number.real, imaginary + number.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber number) {
        double newReal = real * number.real - imaginary * number.imaginary;
        double newImaginary = real * number.imaginary + imaginary * number.real;

        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + Math.abs(imaginary) + "i";
        }

        return real + " + " + imaginary + "i";
    }
}

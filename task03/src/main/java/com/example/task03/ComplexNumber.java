package com.example.task03;

public class ComplexNumber {
    private int real;
    private int imaginary;

    public ComplexNumber(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int _real) {
        real = _real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public void setImaginary(int _imaginary) {
        imaginary = _imaginary;
    }


    public ComplexNumber add(ComplexNumber other) {
        int newReal = real + other.real;
        int newImaginary = imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        int newReal = (real * other.real) - (imaginary * other.imaginary);
        int newImaginary = (real * other.imaginary) + (imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }
}
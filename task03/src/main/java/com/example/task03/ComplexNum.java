package com.example.task03;

public class ComplexNum {

    private double real;
    private double imaginary;

    public ComplexNum(double real, double imaginary) {

        this.real = real;
        this.imaginary = imaginary;

    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNum add(ComplexNum other) {
        return new ComplexNum(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNum multiply(ComplexNum other) {
        double r = this.real * other.real - this.imaginary * other.imaginary;
        double i = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNum(r, i);
    }

    public String toString() {
        return real + " + " + imaginary + "i";
    }

}

package com.example.task03;

public class ComplexNum {
    private final double real;
    private final double imaginary;

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
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNum(newReal, newImaginary);
    }

    /**
     * Вычисляет произведение текущего числа с другим комплексным числом.
     */
    public ComplexNum multiply(ComplexNum other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.imaginary * other.real) + (this.real * other.imaginary);
        return new ComplexNum(newReal, newImaginary);
    }


    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}

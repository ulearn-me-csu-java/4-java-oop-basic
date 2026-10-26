package com.example.task03;

public class Complex {
    private double real;      // Действительная часть
    private double imaginary; // Мнимая часть

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Сложение: (a + bi) + (c + di) = (a+c) + (b+d)i
    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    // Умножение: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public Complex multiply(Complex other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
}

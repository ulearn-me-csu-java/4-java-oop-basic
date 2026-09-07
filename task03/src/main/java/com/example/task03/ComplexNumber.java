package com.example.task03;

public class ComplexNumber {
    private final double real;      // Действительная часть
    private final double imaginary; // Мнимая часть

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Сложение: (a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    // Умножение: (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
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
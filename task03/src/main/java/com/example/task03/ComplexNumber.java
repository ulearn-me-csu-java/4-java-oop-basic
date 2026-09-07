package com.example.task03;

public class ComplexNumber {

    private final double real;
    private final double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real; // инициализация
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real; // получение действительной части
    }
    public double getImaginary() {
        return imaginary; // получение мнимой части
    }

    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary; // формула получатмя при раскрытии (a+bi)(c+di) и подстановки i^2=-1
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        if (imaginary < 0) {
            return real + " - " + (-imaginary) + "i"; // строковое представление для отрицательной мнимой части
        }
        return real + " + " + imaginary + "i"; // строковое представление для положительной мнимой части
    } // разделено, чтобы не было a+-bi
}

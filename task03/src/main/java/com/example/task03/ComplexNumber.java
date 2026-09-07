package com.example.task03;

public class ComplexNumber {
    private double realPart;
    private double imagPart;

    public ComplexNumber(double realPart, double imagPart) {
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.realPart + other.realPart, this.imagPart + other.imagPart);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = this.realPart * other.realPart - this.imagPart * this.imagPart;
        double newImagPart = this.realPart * other.realPart + this.imagPart * this.imagPart;
        return new ComplexNumber(newRealPart, newImagPart);
    }

    @Override
    public String toString() {
        if (imagPart < 0) {
            return realPart + " - " + (-imagPart) + "i";
        } else {
            return realPart + " + " + imagPart + "i";
        }
    }

}
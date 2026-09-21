package com.example.task03;

public class Complex
{
    double a;
    double b;
    public Complex(double a, double b)
    {
        this.a = a;
        this.b = b;
    }
    public Complex Sum(Complex complex)
    {
        double a1 = a + complex.a;
        double b1 = b + complex.b;
        return new Complex(a1, b1);

    }

    public Complex Multiply(Complex complex)
    {
        double a1 = a * complex.a - b * complex.b;
        double b1 = a * complex.b + b * complex.a;
        return new Complex(a1, b1);
    }

    @Override
    public String toString() {
        return b >= 0 ? a + " + " + b + "i" : a + " - " + (-b) + "i";
    }
}

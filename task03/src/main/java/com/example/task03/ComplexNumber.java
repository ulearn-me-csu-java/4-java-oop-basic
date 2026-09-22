package com.example.task03;

public class ComplexNumber
{
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im)
    {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm()
    {
        return im;
    }

    /**
     * (a + bi) + (c + di) = (a + c) + (b + d)i
     */
    public ComplexNumber add(ComplexNumber other)
    {
        return new ComplexNumber(this.re + other.re, this.im + other.im);
    }

    /**
     * (a + bi) * (c + di) = (ac - bd) + (ad + bc)i
     */
    public ComplexNumber multiply(ComplexNumber other)
    {
        double newRe = this.re * other.re - this.im * other.im;
        double newIm = this.re * other.im + this.im * other.re;
        return new ComplexNumber(newRe, newIm);
    }

    @Override
    public String toString()
    {
        if (im >= 0)
        {
            return re + " + " + im + "i";
        }

        return re + " - " + (-im) + "i";
    }
}

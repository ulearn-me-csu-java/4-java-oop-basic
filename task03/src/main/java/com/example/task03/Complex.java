package com.example.task03;

public class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public int getReal() {
        return real;
    }

    public int getImaginary() {
        return imaginary;
    }

    public Complex add(Complex other){
        return new Complex((this.real + other.real), (this.imaginary + other.imaginary));
    }

    public Complex multiply(Complex other){
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public String toString(){
        return (this.real + " + " + imaginary + "i");
    }
}

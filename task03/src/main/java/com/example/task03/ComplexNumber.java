package com.example.task03;

public class ComplexNumber {
    private double real;
    private double img;

    public ComplexNumber(double real, double img){
        this.real =real;
        this.img = img;
    }

    public double getReal(){
        return real;
    }

    public void setReal(double real){
        this.real = real;
    }

    public double getImg(){
        return img;
    }

    public void setImg(double img){
        this.img = img;
    }

    public ComplexNumber add(ComplexNumber compNum){
        return new ComplexNumber(this.real + compNum.real, this.img + compNum.img);
    }

    public ComplexNumber multiply(ComplexNumber compNumb){
        double newReal = this.real * compNumb.real - this.img * compNumb.img;
        double newImg = this.real * compNumb.img + this.img * compNumb.real;
        return new ComplexNumber(newReal, newImg);
    }

    public String toString() {
        return real + " + " + img + "i";
    }
}

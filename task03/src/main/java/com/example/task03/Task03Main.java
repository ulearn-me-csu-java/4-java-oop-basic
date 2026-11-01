package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 5);
        ComplexNumber num2 = new ComplexNumber(4, -7);
        
        ComplexNumber reslt1 = num1.add(num2);
        ComplexNumber reslt2 = num1.multiply(num2);

        System.out.println(reslt1.toString());
        System.out.println(reslt2.toString());
    }
}

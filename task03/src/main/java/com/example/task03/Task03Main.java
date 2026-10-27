package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumber(3, 2);
        ComplexNumber b = new ComplexNumber(1, 4);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("Сумма: " + a.add(b));
        System.out.println("Произведение: " + a.multiply(b));
    }
}
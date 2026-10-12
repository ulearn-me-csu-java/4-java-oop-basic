package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 2.0);
        ComplexNumber c2 = new ComplexNumber(1.0, 4.0);

        ComplexNumber sum = c1.add(c2);
        ComplexNumber product = c1.multiply(c2);

        System.out.println("Первое число: " + c1);
        System.out.println("Второе число: " + c2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
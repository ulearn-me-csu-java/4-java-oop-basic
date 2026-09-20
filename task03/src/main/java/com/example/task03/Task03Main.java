package com.example.task03;

public class Task03Main {

    public static void main(String[] args) {

        ComplexNumber number1 = new ComplexNumber(2, 3);
        ComplexNumber number2 = new ComplexNumber(4, 5);

        ComplexNumber sum = number1.add(number2);
        ComplexNumber product = number1.multiply(number2);

        System.out.println("Первое число: " + number1);
        System.out.println("Второе число: " + number2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
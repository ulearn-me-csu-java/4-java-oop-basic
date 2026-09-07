package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(5, 2);
        ComplexNumber num2 = new ComplexNumber(14, -5);

        ComplexNumber sum = num1.add(num2);
        ComplexNumber mult = num1.multiply(num2);

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mult);
    }
}
package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex num1 = new Complex(2, 3);
        Complex num2 = new Complex(4, -1);

        Complex sum = num1.add(num2);
        Complex mult = num1.multiply(num2);

        System.out.println("Первое число: " + num1);
        System.out.println("Второе число: " + num2);
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + mult);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first = new ComplexNumber(2, 3);
        ComplexNumber second = new ComplexNumber(4, 5);

        ComplexNumber sum = first.add(second);
        ComplexNumber product = first.multiply(second);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(3, 4);
        ComplexNumber z2 = new ComplexNumber(1, -2);

        ComplexNumber sum = z1.add(z2);
        System.out.println("Сумма: " + sum);

        ComplexNumber multiply = z1.multiply(z2);
        System.out.println("Произведение: " + multiply);

    }
}

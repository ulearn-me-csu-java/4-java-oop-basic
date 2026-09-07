package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber example1 = new ComplexNumber(3, 2);
        ComplexNumber example2 = new ComplexNumber(1, 4);

        System.out.println("Первое: " + example1);
        System.out.println("Второе: " + example2);

        ComplexNumber sumResult = example1.add(example2);
        ComplexNumber multiplyingResult = example1.multiply(example2);

        System.out.println("Сумма: " + sumResult);
        System.out.println("Произведение: " + multiplyingResult);
    }
}

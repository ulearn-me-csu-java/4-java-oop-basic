package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3.0, 2.0);  // 3 + 2i
        ComplexNumber c2 = new ComplexNumber(1.0, 4.0);  // 1 + 4i

        ComplexNumber sum = c1.add(c2);
        ComplexNumber product = c1.multiply(c2);

        System.out.println("Число 1: " + c1);
        System.out.println("Число 2: " + c2);
        System.out.println("Сумма: " + sum);          // 4.0 + 6.0i
        System.out.println("Произведение: " + product); // -5.0 + 14.0i
    }
}

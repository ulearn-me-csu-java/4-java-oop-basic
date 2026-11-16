package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2); // 1 + 2i
        Complex c2 = new Complex(3, 4); // 3 + 4i

        System.out.println("Сумма: " + c1.add(c2));      // 4.0 + 6.0i
        System.out.println("Произведение: " + c1.multiply(c2)); // -5.0 + 10.0i
    }
}

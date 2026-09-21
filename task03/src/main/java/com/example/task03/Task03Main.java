package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, -4);

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c1 + c2 = " + c1.Sum(c2));
        System.out.println("c1 * c2 = " + c1.Multiply(c2));
    }
}

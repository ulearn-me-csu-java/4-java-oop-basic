package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(13, 23);
        ComplexNumber n2 = new ComplexNumber(59, 52);
        System.out.println(n1.add(n2).toString());
        System.out.println(n1.multiply(n2).toString());
    }
}

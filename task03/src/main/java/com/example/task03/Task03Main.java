package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(1, 2);
        ComplexNumber n2 = new ComplexNumber(3, 4);

        ComplexNumber s = n1.add(n2);
        ComplexNumber m = n1.multiply(n2);

        System.out.println(s);
        System.out.println(m);
    }
}

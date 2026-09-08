package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex first = new Complex(1, 2);
        Complex second = new Complex(3,4);

        Complex sum = first.add(second);
        Complex multi = first.multiply(second);

        System.out.println(sum);
        System.out.println(multi);
    }
}

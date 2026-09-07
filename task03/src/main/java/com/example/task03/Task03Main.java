package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNum num1 = new ComplexNum(13, 67);
        ComplexNum num2 = new ComplexNum(33, 11);
        ComplexNum sum = num1.add(num2);
        ComplexNum multi = num1.multiply(num2);

        System.out.println(sum);
        System.out.println(multi);
    }
}

package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber first_number = new ComplexNumber(2, 3);
        ComplexNumber second_number = new ComplexNumber(4, -5);
        ComplexNumber third_number = new ComplexNumber(-999999, 0);
        System.out.println(first_number.toString());
        System.out.println(second_number.toString());
        System.out.println(third_number.toString());

        System.out.println(first_number.summary(second_number).toString());
        System.out.println(first_number.summary(first_number).toString());

        ComplexNumber product = first_number.product(second_number);
        System.out.println(product);


    }
}

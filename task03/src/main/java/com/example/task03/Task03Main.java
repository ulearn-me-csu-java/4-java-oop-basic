package com.example.task03;

import com.example.ComplexNumber;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber z1 = new ComplexNumber(2, 3);
        ComplexNumber z2 = new ComplexNumber(4, -1);
        ComplexNumber sum = z1.add(z2);
        ComplexNumber product = z1.multiply(z2);
        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + product);
    }
}

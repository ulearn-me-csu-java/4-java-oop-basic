package com.example.task03;

public class Task03Main
{
    public static void main(String[] args)
    {
        ComplexNumber z1 = new ComplexNumber(1, 2);
        ComplexNumber z2 = new ComplexNumber(3, -4);

        ComplexNumber sum = z1.add(z2);
        ComplexNumber product = z1.multiply(z2);

        System.out.println("z1 = " + z1);
        System.out.println("z2 = " + z2);
        System.out.println("z1 + z2 = " + sum);
        System.out.println("z1 * z2 = " + product);
    }
}

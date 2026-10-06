package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        Complex a=new Complex(2,6);
        Complex b=new Complex(3,1);

        Complex sum=a.sum(b);
        Complex multiply=a.multiply(b);

        System.out.println("Первое число: "+a);
        System.out.println("Второе число: "+b);
        System.out.println("Сумма: "+sum);
        System.out.println("Произведение: "+multiply);
    }
}

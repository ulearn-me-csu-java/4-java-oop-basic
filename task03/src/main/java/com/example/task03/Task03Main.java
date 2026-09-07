package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {

        ComplexNum num1 = new ComplexNum(6.0, 7.0);
        ComplexNum num2 = new ComplexNum(4.0, 2.0);


        ComplexNum sum = num1.add(num2);
        System.out.println("Сумма: " + sum);


        ComplexNum product = num1.multiply(num2);
        System.out.println("Произведение: " + product);
    }

}

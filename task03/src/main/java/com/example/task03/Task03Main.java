package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        // Создаем два комплексных числа
        ComplexNumber c1 = new ComplexNumber(3, 4);  // 3 + 4i
        ComplexNumber c2 = new ComplexNumber(1, 2);  // 1 + 2i

        System.out.println("Первое число: " + c1);
        System.out.println("Второе число: " + c2);
        System.out.println();

        // Сумма
        ComplexNumber sum = c1.add(c2);
        System.out.println("Сумма: " + c1 + " + " + c2 + " = " + sum);

        // Разность
        ComplexNumber diff = c1.subtract(c2);
        System.out.println("Разность: " + c1 + " - " + c2 + " = " + diff);

        // Произведение
        ComplexNumber product = c1.multiply(c2);
        System.out.println("Произведение: " + c1 + " * " + c2 + " = " + product);

        // Частное
        ComplexNumber quotient = c1.divide(c2);
        System.out.println("Частное: " + c1 + " / " + c2 + " = " + quotient);

        System.out.println();

        // Дополнительные операции
        System.out.println("Модуль c1: " + c1.modulus());
        System.out.println("Аргумент c1: " + c1.argument() + " радиан");
        System.out.println("Сопряженное к c1: " + c1.conjugate());
    }
}

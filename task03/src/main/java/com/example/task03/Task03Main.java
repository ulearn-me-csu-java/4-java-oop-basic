package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(3.0, 4.0);
        ComplexNumber secondNumber = new ComplexNumber(1.0, 2.0);

        ComplexNumber sumResult = firstNumber.add(secondNumber);
        ComplexNumber multiplyResult = firstNumber.multiply(secondNumber);

        System.out.println("Первое число: " + firstNumber); // преобразование при конкатенции происходит автоматически
        System.out.println("Второе число: " + secondNumber);
        System.out.println("Сумма: " + sumResult);
        System.out.println("Произведение: " + multiplyResult);
    }
}

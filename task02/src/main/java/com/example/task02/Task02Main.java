package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(2,30,45);
        TimeSpan t2 = new TimeSpan(1,45,30);

        System.out.println("Начальные значения");
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);

        t1.add(t2);
        System.out.println("t1 = " + t1);

        TimeSpan t3 = new TimeSpan(1, 20, 10);
        System.out.println("Вычитаем t3 = " + t3);
        t1.subtract(t3);
        System.out.println("t1 = " + t1);

    }
}

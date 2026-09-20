package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {

        TimeSpan time1 = new TimeSpan(1, 30, 30);

        System.out.println(time1);

        System.out.println("Часы: " + time1.getHours());
        System.out.println("Минуты: " + time1.getMinutes());
        System.out.println("Секунды: " + time1.getSeconds());

        time1.setHours(2);
        time1.setMinutes(20);
        time1.setSeconds(10);

        System.out.println(time1);

        TimeSpan time2 = new TimeSpan(1, 40, 50);
        time1.add(time2);

        System.out.println("После сложения: " + time1);

        time1.subtract(time2);

        System.out.println("После вычитания: " + time1);
    }
}
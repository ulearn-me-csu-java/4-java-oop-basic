package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan a = new TimeSpan(0, 30, 0);
        TimeSpan b = new TimeSpan(0, 30, 0);

        a.add(b);
        System.out.println(a);   // 1 ч 0 мин 0 сек

        a.subtract(new TimeSpan(0, 0, 1));
        System.out.println(a);   // 0 ч 59 мин 59 сек

    }
}

package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        TimeSpan t1 = new TimeSpan(2, 0, 0);
        t1.setMinutes(100);
        //t1.subtract(new TimeSpan(0, 0, 1));
        System.out.println(t1);
    }
}

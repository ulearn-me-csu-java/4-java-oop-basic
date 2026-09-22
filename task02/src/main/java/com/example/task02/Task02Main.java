package com.example.task02;

public class Task02Main
{
    public static void main(String[] args)
    {
        TimeSpan t1 = new TimeSpan(1, 50, 40);
        TimeSpan t2 = new TimeSpan(0, 30, 30);

        t1.add(t2);
        System.out.println(t1);

        t1.subtract(new TimeSpan(0, 30, 0));
        System.out.println(t1);

        TimeSpan t3 = new TimeSpan(0, 30, 0);
        t3.add(new TimeSpan(0, 30, 0));
        System.out.println(t3);
    }
}

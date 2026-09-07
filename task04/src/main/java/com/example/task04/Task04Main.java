package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(3, 3);
        Point c = new Point(5, 5);
        Point d = new Point(2, 1);

        Line line = new Line(a, b);

        System.out.println(line);
        System.out.println(line.isCollinearLine(c));
        System.out.println(line.isCollinearLine(d));
    }
}

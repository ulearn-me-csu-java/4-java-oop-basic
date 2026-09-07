package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(4, 4);
        Line line = new Line(a, b);
        System.out.println(line);

        Point p1 = new Point(2, 2);   // лежит на прямой
        Point p2 = new Point(2, 3);   // не лежит
        System.out.println(line.isCollinearLine(p1));
        System.out.println(line.isCollinearLine(p2));
    }
}

package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1 = new Point(10, 20);
        Point p2 = new Point(20, 30);
        Point p3 = new Point(15, 25);
        Point p4 = new Point(40, 40);

        Line line = new Line(p1, p2);
        System.out.println(line.toString());
        System.out.println(line.getP1());
        System.out.println(line.getP2());
        System.out.println(line.isCollinearLine(p3));
        System.out.println(line.isCollinearLine(p4));
    }
}

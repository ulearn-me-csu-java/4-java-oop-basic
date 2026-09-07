package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        Point p3 = new Point(8, 9);

        PolygonalLine line = new PolygonalLine();
        line.addPoint(p1);
        line.addPoint(p2);
        line.addPoint(p3);

        System.out.println(line.getLength());

        System.out.println(p1.getLength(p2));
    }
}

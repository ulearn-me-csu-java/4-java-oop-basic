package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();

        line.addPoint(new Point(0, 0));
        line.addPoint(3, 4);
        line.addPoint(3, 10);

        System.out.println(line.getLength()); // 11.0

        Point[] arr = { new Point(0, 0), new Point(6, 8) };
        line.setPoints(arr);
        System.out.println(line.getLength()); // 10.0
    }
}
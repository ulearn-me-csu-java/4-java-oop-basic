package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();
        line.addPoint(1, 2);
        line.addPoint(5, 2);
        line.addPoint(3, 5);
        System.out.println("Длина: " + line.getLength());

        Point[] arr = {new Point(1, 1), new Point(2, 2)};
        line.setPoints(arr);
        System.out.println("Длина после замены: " + line.getLength());
    }
}
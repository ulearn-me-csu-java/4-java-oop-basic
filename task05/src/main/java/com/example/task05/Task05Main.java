package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        PolygonalLine line = new PolygonalLine();

        line.addPoint(0.0, 0.0);
        line.addPoint(3.0, 4.0);
        line.addPoint(6.0, 8.0);

        System.out.println("Длина ломаной линии: " + line.getLength());
    }
}
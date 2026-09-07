package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {

        PolygonalLine line = new PolygonalLine();

        line.addPoint(0, 5);
        line.addPoint(13, 5);
        line.addPoint(16, 21);

        System.out.println("Длина ломанной: " + line.getLength());
    }
}

package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        // Демонстрация работы Point
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        System.out.println("Расстояние от " + p1.getX() + "," + p1.getY()
                + " до " + p2.getX() + "," + p2.getY()
                + " = " + p1.getLength(p2));

        // Демонстрация работы PolygonalLine
        PolygonalLine line = new PolygonalLine();
        line.setPoints(new Point[]{
                new Point(1, 2),
                new Point(4, 6),
                new Point(8, 9),
                new Point(12, 12),
                new Point(15, 16)
        });
        System.out.println("Длина ломаной = " + line.getLength());

        // Демонстрация добавления точек
        PolygonalLine line2 = new PolygonalLine();
        line2.addPoint(1, 2);
        line2.addPoint(4, 6);
        line2.addPoint(8, 9);
        System.out.println("Длина второй ломаной = " + line2.getLength());
    }
}
package com.example.task05;

public class Task05Main {
    public static void main(String[] args) {
        // === Создаем ломаную линию ===
        PolygonalLine line = new PolygonalLine();
        System.out.println("Пустая линия: " + line);

        // === Добавляем точки через addPoint(Point) ===
        line.addPoint(new Point(0, 0));
        line.addPoint(new Point(3, 4));
        line.addPoint(new Point(6, 8));
        System.out.println("После добавления точек: " + line);

        // === Добавляем точки через addPoint(double, double) ===
        line.addPoint(10, 10);
        line.addPoint(15, 15);
        System.out.println("После добавления координат: " + line);

        // === Получаем длину ===
        System.out.println("Длина ломаной: " + line.getLength());

        // === Количество точек ===
        System.out.println("Количество точек: " + line.getPointsCount());

        // === Получаем все точки ===
        System.out.println("Все точки:");
        for (Point p : line.getPoints()) {
            System.out.println("  " + p);
        }

        // === Устанавливаем новые точки через setPoints() ===
        Point[] newPoints = {
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3)
        };
        line.setPoints(newPoints);
        System.out.println("После setPoints: " + line);
        System.out.println("Длина: " + line.getLength());

        // === Работа с Point ===
        Point p1 = new Point(1, 2);
        Point p2 = new Point(4, 6);
        System.out.println("Расстояние между " + p1 + " и " + p2 + " = " + p1.getLength(p2));

        // === Изменение точки через сеттеры ===
        p1.setX(5);
        p1.setY(10);
        System.out.println("Измененная точка: " + p1);

        // === Обработка null ===
        line.addPoint(null);
        System.out.println("После добавления null: " + line);
        System.out.println("Количество точек: " + line.getPointsCount());
    }
}
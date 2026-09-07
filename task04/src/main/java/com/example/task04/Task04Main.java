package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point startPoint = new Point(1, 1);
        Point endPoint = new Point(4, 4);

        Line line = new Line(startPoint, endPoint);
        System.out.println("Создан отрезок: " + line);

        // Создаем точки для проверки коллинеарности
        Point p1 = new Point(2, 2);
        Point p2 = new Point(5, 5);
        Point p3 = new Point(2, 5);

        // Проверяем точки
        System.out.println("\n--- Результаты проверки точек ---");
        System.out.println("Точка (2, 2) на прямой? -> " + line.isCollinearLine(p1));
        System.out.println("Точка (5, 5) на прямой? -> " + line.isCollinearLine(p2));
        System.out.println("Точка (2, 5) на прямой? -> " + line.isCollinearLine(p3));


    }
}

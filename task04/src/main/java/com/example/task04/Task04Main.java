package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        // Создаем точки
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 4);
        Point p3 = new Point(2, 2);   // На прямой y = x
        Point p4 = new Point(2, 3);   // Не на прямой y = x
        Point p5 = new Point(5, 5);   // На прямой, но вне отрезка

        // Создаем отрезок
        Line line = new Line(p1, p2);
        System.out.println("Отрезок: " + line);

        // Проверка коллинеарности
        System.out.println();
        System.out.println("Точка " + p3 + " на прямой: " + line.isCollinearLine(p3));     // true
        System.out.println("Точка " + p4 + " на прямой: " + line.isCollinearLine(p4));     // false
        System.out.println("Точка " + p5 + " на прямой: " + line.isCollinearLine(p5));     // true

        // Проверка принадлежности отрезку
        System.out.println();
        System.out.println("Точка " + p3 + " на отрезке: " + line.isPointOnSegment(p3));   // true
        System.out.println("Точка " + p5 + " на отрезке: " + line.isPointOnSegment(p5));   // false
    }
}
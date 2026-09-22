package com.example.task04;

public class Task04Main
{
    public static void main(String[] args)
    {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 2);
        Line line = new Line(p1, p2);

        System.out.println("Отрезок: " + line);
        System.out.println("Лежание на прямой для (1, 1): " + line.isCollinearLine(new Point(1, 1)));
        System.out.println("Лежание на прямой для (3, 3): " + line.isCollinearLine(new Point(3, 3)));
        System.out.println("Лежание на прямой для (1, 2): " + line.isCollinearLine(new Point(1, 2)));
    }
}

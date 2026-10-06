package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Point p1=new Point(1, 2);
        Point p2=new Point(3, 4);
        Line line=new Line(p1, p2);
        System.out.println("Первая точка: "+line.getP1());
        System.out.println("Вторая точка: "+line.getP2());
        System.out.println("Отрезок: "+line);
        Point p3=new Point(5,6);
        Point p4=new Point(5,7);
        System.out.println("Точка "+p3+" лежит на прямой: "
                + line.isCollinearLine(p3));
        System.out.println("Точка "+p4+" лежит на прямой: "
                + line.isCollinearLine(p4));
    }
}

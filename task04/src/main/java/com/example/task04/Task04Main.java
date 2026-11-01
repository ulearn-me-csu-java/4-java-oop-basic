package com.example.task04;

public class Task04Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(0, 0), new Point(2, 2));
        System.out.println(line);
        System.out.println("(1; 1): " + line.isCollinearLine(new Point(1, 1)));
        System.out.println("(1; 2): " + line.isCollinearLine(new Point(1, 2)));
        System.out.println("(5; 5): " + line.isCollinearLine(new Point(5, 5)));
    }
}

package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    /**
     * Проверяет, лежит ли переданная точка на прямой,
     * содержащей текущий отрезок
     */
    public boolean isCollinearLine(Point p) {
        if (p == null) {
            return false;
        }

        long val = (long)(p.x - p1.x) * (p2.y - p1.y) - (long)(p.y - p1.y) * (p2.x - p1.x);

        return val == 0;
    }


    @Override
    public String toString() {
        return "Line from " + p1.toString() + " to " + p2.toString();
    }
}

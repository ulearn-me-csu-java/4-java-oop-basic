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

    @Override
    public String toString() {
        return "Line {" + p1 + ", " + p2 + "}";
    }

    // (x2 - x1) * (y3 - y1) == (y2 - y1) * (x3 - x1)
    public boolean isCollinearLine(Point p) {
        // Векторное произведение векторов (p1->p2) и (p1->p)
        long dx1 = p2.x - p1.x;
        long dy1 = p2.y - p1.y;
        long dx2 = p.x - p1.x;
        long dy2 = p.y - p1.y;
        // Если векторы коллинеарны, их векторное произведение равно 0
        return dx1 * dy2 == dy1 * dx2;
    }
}

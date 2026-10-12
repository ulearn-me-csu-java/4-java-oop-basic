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

    public boolean isCollinearLine(Point p) {
        long x1 = p1.getX();
        long y1 = p1.getY();
        long x2 = p2.getX();
        long y2 = p2.getY();
        long x3 = p.getX();
        long y3 = p.getY();

        return (x3 - x1) * (y2 - y1) == (y3 - y1) * (x2 - x1);
    }

    @Override
    public String toString() {
        return "Line[" + p1 + ", " + p2 + "]";
    }
}
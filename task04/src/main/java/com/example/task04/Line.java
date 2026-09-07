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
        return "Line from " + p1 + " to " + p2;
    }

    public boolean isCollinearLine(Point p) {
        int dx = p2.getX() - p1.getX();
        int dy = p2.getY() - p1.getY();

        int px = p.getX() - p1.getX();
        int py = p.getY() - p1.getY();



        return dx * py - dy * px == 0;
    }
}
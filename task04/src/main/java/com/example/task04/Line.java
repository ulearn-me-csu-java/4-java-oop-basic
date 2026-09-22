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
        long dx = (long) p2.getX() - p1.getX();
        long dy = (long) p2.getY() - p1.getY();
        long pointDx = (long) p.getX() - p1.getX();
        long pointDy = (long) p.getY() - p1.getY();

        if (dx == 0 && dy == 0) {
            return pointDx == 0 && pointDy == 0;
        }

        return dx * pointDy == dy * pointDx;
    }

    @Override
    public String toString() {
        return p1 + " - " + p2;
    }
}

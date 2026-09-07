package com.example.task04;

public class Line {

    private Point point1;
    private Point point2;

    public Line(Point p1, Point p2) {
        this.point1 = p1;
        this.point2 = p2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public boolean isCollinearLine(Point p) {
        return (long)(p.getX() - point1.getX()) * (point2.getY() - point1.getY())
                == (long)(p.getY() - point1.getY()) * (point2.getX() - point1.getX());
    }

    public String toString() {
        return point1 + " - " + point2;
    }

}

package com.example.task04;

import java.awt.*;

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

    public String toString() {
        return "Line[" + p1 + "," + p2 + "]";
    }

    public boolean isCollinearLine(Point p) {
        int x1 = p1.getX(), y1 = p1.getY();
        int x2 = p2.getX(), y2 = p2.getY();
        int x = p.getX(), y = p.getY();
        int crossProduct = (x2 - x1) * (y - y1) - (y2 - y1) * (x - x1);
        return crossProduct == 0;
    }
}

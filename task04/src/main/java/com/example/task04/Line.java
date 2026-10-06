package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;
    public Line(Point p1, Point p2) {
        this.p1=p1;
        this.p2=p2;
    }
    public Point getP1() {
        return p1;
    }
    public Point getP2() {
        return p2;
    }
    @Override
    public String toString() {
        return "Line: "+p1+" - "+p2;
    }
    public boolean isCollinearLine(Point p) {
        double x1=p1.getX();
        double y1=p1.getY();
        double x2=p2.getX();
        double y2=p2.getY();
        double x=p.getX();
        double y=p.getY();
        return (x-x1)*(y2-y1)==(y-y1)*(x2-x1);
    }
}

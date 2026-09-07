package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {
    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    public void addPoint(Point point) {
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        if (points.size() < 2) {
            return 0.0;
        }

        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point p1 = points.get(i);
            Point p2 = points.get(i + 1);
            totalLength += p1.getLength(p2);
        }
        return totalLength;
    }
}
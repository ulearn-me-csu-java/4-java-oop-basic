package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {
    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();
        if (points != null) {
            for (Point p : points) {
                if (p != null) {
                    this.points.add(new Point(p.getX(), p.getY()));
                }
            }
        }
    }

    public void addPoint(Point point) {
        if (point != null) {
            this.points.add(new Point(point.getX(), point.getY()));
        }
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).getLength(points.get(i + 1));
        }
        return totalLength;
    }
}
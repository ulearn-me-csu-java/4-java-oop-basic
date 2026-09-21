package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear();
        if (points != null) {
            for (Point p : points) {
                // Копируем точку, чтобы внешняя модификация не влияла на ломаную
                this.points.add(new Point(p.getX(), p.getY()));
            }
        }
    }

    public void addPoint(Point point) {
        // Тоже копируем
        this.points.add(new Point(point.getX(), point.getY()));
    }

    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        double length = 0;
        for (int i = 1; i < points.size(); i++) {
            length += points.get(i - 1).getLength(points.get(i));
        }
        return length;
    }

}
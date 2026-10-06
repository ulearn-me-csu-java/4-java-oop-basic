package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine() {
        points = new ArrayList();
    }

    /**
     * Добавляет точку в конец ломаной.
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        for (Point p : points) {
            this.points.add(new Point(p.getX(), p.getY()));
        }
    }

    /**
     * Добавляет точку в конец ломаной.
     */
    public void addPoint(Point point) {
        points.add(new Point(point.getX(), point.getY()));
    }

    /**
     * Добавляет точку с заданными координатами в конец ломаной.
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Вычисляет общую длину ломаной (сумма длин всех звеньев).
     */
    public double getLength() {
        if (points.size() < 2) {
            return 0.0;
        }
        double total = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            total += points.get(i).getLength(points.get(i + 1));
        }
        return total;
    }

}
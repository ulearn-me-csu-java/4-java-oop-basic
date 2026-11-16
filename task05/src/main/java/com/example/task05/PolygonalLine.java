package com.example.task05;

import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (point == null) {
            return;
        }

        this.points = Arrays.copyOf(this.points, this.points.length + 1);
        this.points[this.points.length - 1] = new Point(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        addPoint(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        if (points == null || points.length < 2) {
            return 0.0;
        }
        double totalLenght = 0d;
        for (int i = 0; i < points.length - 1; i++) {
            Point p1 = points[i];
            Point p2 = points[i + 1];
            totalLenght += p1.getLength(p2);
        }
        return totalLenght;
    }

}

package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final List<Point> pointsList = new ArrayList<>();

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.pointsList.clear();
        if (points != null) {
            for (Point p : points) {
                this.pointsList.add(new Point(p.getX(), p.getY()));
            }
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (point != null) {
            this.pointsList.add(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.pointsList.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0.0;


        if (pointsList.size() < 2) {
            return totalLength;
        }


        for (int i = 0; i < pointsList.size() - 1; i++) {
            Point current = pointsList.get(i);
            Point next = pointsList.get(i + 1);
            totalLength += current.getLength(next);
        }

        return totalLength;
    }

}

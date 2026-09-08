package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private final List<Point> points;

    public PolygonalLine() {
        this.points = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear();
        if (points == null) {
            return;
        }
        // ВАЖНО: создаем КОПИИ точек, чтобы не зависеть от внешних изменений
        for (Point point : points) {
            if (point != null) {
                this.points.add(new Point(point)); // Используем конструктор копирования
            }
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
        // ВАЖНО: создаем КОПИЮ точки
        points.add(new Point(point));
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        if (points.size() < 2) {
            return 0.0;
        }

        double totalLength = 0.0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i);
            Point next = points.get(i + 1);
            totalLength += current.getLength(next);
        }
        return totalLength;
    }

    /**
     * Возвращает количество точек в ломаной линии
     *
     * @return количество точек
     */
    public int getPointsCount() {
        return points.size();
    }

    /**
     * Возвращает все точки ломаной линии (копии)
     *
     * @return массив копий точек
     */
    public Point[] getPoints() {
        Point[] result = new Point[points.size()];
        for (int i = 0; i < points.size(); i++) {
            result[i] = new Point(points.get(i)); // Возвращаем копии
        }
        return result;
    }

    @Override
    public String toString() {
        if (points.isEmpty()) {
            return "PolygonalLine[]";
        }
        StringBuilder sb = new StringBuilder("PolygonalLine[");
        for (int i = 0; i < points.size(); i++) {
            sb.append(points.get(i));
            if (i < points.size() - 1) {
                sb.append(" -> ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
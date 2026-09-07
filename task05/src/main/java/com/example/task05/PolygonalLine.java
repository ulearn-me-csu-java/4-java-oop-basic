package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private final List<Point> points = new ArrayList<>(); // список точек ломаной линии

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        this.points.clear(); // очистка текущего списка точек
        if (points != null) {
            for (Point point : points) {
                this.addPoint(point); // добавление копии точки в список
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
            this.points.add(new Point(point.getX(), point.getY())); // добавление копии точки
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y)); // создание и добавление новой точки
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point current = points.get(i); // текущая точка
            Point next = points.get(i + 1); // следующая точка
            totalLength += current.getLength(next); // суммирование расстояния между соседними точками
        }
        return totalLength;
    }

}

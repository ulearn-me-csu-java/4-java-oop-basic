package com.example.task05;

import java.util.ArrayList;
import java.util.List;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private List<Point> points;

    public PolygonalLine() {
        this.points = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * P.S. Исходя из тестов оказывается, что метод должен именно глубоко копировать points
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     *
     */
    public void setPoints(Point[] points) {
        this.points = new ArrayList<>();
        if (points != null) {
            for (Point point : points) {
                this.points.add(new Point(point.getX(), point.getY()));
            }
        }
    }

    /**
     * Добавляет точку к ломаной линии (делает копию точки)
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        if (point != null) {
            points.add(new Point(point.getX(), point.getY()));
        }
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
            return 0;
        }

        double totalLength = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).getLength(points.get(i + 1));
        }
        return totalLength;
    }

    // Далее представлены методы не из ТЗ
    /**
     * Возвращает количество точек в ломаной линии
     */
    public int getPointCount() {
        return points.size();
    }

    /**
     * Возвращает точку по индексу (НЕ КОПИЮ!)
     */
    public Point getPoint(int index) {
        if (index >= 0 && index < points.size()) {
            return points.get(index);
        }
        throw new IndexOutOfBoundsException("Невалидный индекс для данной ломанной линии");
    }
}

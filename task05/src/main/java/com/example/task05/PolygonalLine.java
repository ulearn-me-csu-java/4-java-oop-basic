package com.example.task05;

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
        this.points = points != null ? points.clone() : new Point[0];
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
        Point[] newPoints = new Point[points.length + 1];
        System.arraycopy(points, 0, newPoints, 0, points.length);
        newPoints[newPoints.length - 1] = point;
        this.points = newPoints;
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
        double totalLength = 0;
        for (int i = 0; i < points.length - 1; i++) {
            totalLength += points[i].getLength(points[i + 1]);
        }
        return totalLength;
    }
}
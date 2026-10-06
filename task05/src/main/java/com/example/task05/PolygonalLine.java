package com.example.task05;

/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points;

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        if (points == null) {
            this.points = null;
            return;
        }

        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(
                    points[i].getX(),
                    points[i].getY()
            );
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        Point newPoint = new Point(point.getX(), point.getY());

        if (points == null) {
            points = new Point[]{newPoint};
        } else {
            Point[] newPoints = new Point[points.length + 1];

            for (int i = 0; i < points.length; i++) {
                newPoints[i] = points[i];
            }

            newPoints[points.length] = newPoint;
            points = newPoints;
        }
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
        double length = 0;

        if (points == null || points.length < 2) {
            return length;
        }

        for (int i = 1; i < points.length; i++) {
            length += points[i - 1].getLength(points[i]);
        }

        return length;
    }
}

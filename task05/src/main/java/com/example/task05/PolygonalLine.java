package com.example.task05;

import java.util.ArrayList;
import java.util.List;

public class PolygonalLine {
    // Используем ArrayList (список), так как он умеет динамически расширяться
    private List<Point> points = new ArrayList<>();

    public void setPoints(Point[] points) {
        this.points.clear(); // Очищаем старые точки
        for (Point p : points) {
            this.points.add(p); // Добавляем новые из массива
        }
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    // Перегрузка: метод с таким же названием, но принимает X и Y
    public void addPoint(double x, double y) {
        this.points.add(new Point(x, y));
    }

    public double getLength() {
        if (points.size() < 2) {
            return 0; // Если точек меньше двух, длина ломаной равна 0
        }

        double totalLength = 0;
        // Идем по точкам и складываем расстояние между соседними
        for (int i = 0; i < points.size() - 1; i++) {
            Point currentPoint = points.get(i);
            Point nextPoint = points.get(i + 1);
            totalLength += currentPoint.getLength(nextPoint);
        }
        return totalLength;
    }
}

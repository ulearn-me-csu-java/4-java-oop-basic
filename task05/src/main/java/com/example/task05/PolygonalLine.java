package com.example.task05;
import java.util.Arrays;
/**
 * Ломаная линия
 */
public class PolygonalLine {

    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++){
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public void addPoint(Point point) {
        Point[] newPoints = Arrays.copyOf(points, points.length + 1);
        newPoints[newPoints.length - 1] = new Point(point.getX(), point.getY());
        points = newPoints;
    }

    public void addPoint(double x, double y) {
        Point[] newPoints = Arrays.copyOf(points, points.length + 1);
        newPoints[newPoints.length - 1] = new Point(x, y);
        points = newPoints;
    }

    public double getLength() {
        double sum = 0;
        for (int i = 0; i < points.length - 1; i++) {
            sum += points[i].getLength(points[i+1]);
        }
        return sum;
    }

}

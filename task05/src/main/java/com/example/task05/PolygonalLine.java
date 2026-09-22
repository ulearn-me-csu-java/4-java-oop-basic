package com.example.task05;

public class PolygonalLine {
    private Point[] points = new Point[0];

    public void setPoints(Point[] points) {
        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }

    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    public void addPoint(double x, double y) {
        Point[] newPoints = new Point[points.length + 1];

        for (int i = 0; i < points.length; i++) {
            newPoints[i] = points[i];
        }

        newPoints[points.length] = new Point(x, y);
        points = newPoints;
    }

    public double getLength() {
        double length = 0;

        for (int i = 1; i < points.length; i++) {
            length += points[i - 1].getLength(points[i]);
        }

        return length;
    }
}

package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private Point[] points = new Point[0];


    public void setPoints(Point[] points) {
        this.points = new Point[points.length];

        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i].getX(), points[i].getY());
        }
    }


    public void addPoint(Point point) {
        Point[] new_points = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, new_points, 0, this.points.length);
        new_points[new_points.length - 1] =  new Point(point.getX(), point.getY());
        this.points = new_points;

    }


    public void addPoint(double x, double y) {
        Point[] new_points = new Point[this.points.length + 1];
        System.arraycopy(this.points, 0, new_points, 0, this.points.length);
        Point point = new Point(x, y);
        new_points[new_points.length - 1] = point;
        this.points = new_points;
    }


    public double getLength() {
        double sumLength = 0;
        for (int i = 0; i < points.length-1; i++){
            double pointDist = this.points[i].getLength(this.points[i+1]);
            sumLength += pointDist;
        }
        return sumLength;
    }

}

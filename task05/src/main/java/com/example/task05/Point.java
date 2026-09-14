package com.example.task05;

/**
 * Точка в двумерном пространстве
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }


    public double getY() {
        return this.y;
    }


    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }


    public double getLength(Point point) {
        double dx = this.getX() - point.x;
        double dy = this.getY() - point.y;
        return Math.sqrt(dx*dx + dy*dy);
    }

}

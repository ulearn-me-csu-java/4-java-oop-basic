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
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getLength(Point point) {
        double dx = this.x - point.getX();
        double dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

}
package com.example.task04;

public class Point {
    final double x;
    final double y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }
}

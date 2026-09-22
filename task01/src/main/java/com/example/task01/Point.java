package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int oldX = x;
        x = -y;
        y = -oldX;
    }

    public double distance(Point point) {
        double dx = (double) x - point.x;
        double dy = (double) y - point.y;

        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

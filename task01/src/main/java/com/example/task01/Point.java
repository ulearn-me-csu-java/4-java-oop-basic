package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void flip() {
        int tempX = -this.y;
        int tempY = -this.x;
        this.x = tempX;
        this.y = tempY;
    }

    public double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
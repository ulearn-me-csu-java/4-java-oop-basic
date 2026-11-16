package com.example.task01;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // "Вращает" точку: меняет знаки и меняет местами (5, -7) -> (7, -5)
    public void flip() {
        x = -x; // 5 -> -5
        y = -y; // -7 -> 7
        int temp = x;
        x = y;  // x = 7
        y = temp; // y = -5
    }

    // Расстояние между текущей точкой и переданной
    public double distance(Point point) {
        return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2));
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

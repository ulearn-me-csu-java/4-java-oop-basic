package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {
        int temp = x;
        x = -y;
        y = -temp;
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    double distance(Point point) {
        return Math.sqrt((point.x - this.x) * (point.x - this.x) + (point.y - this.y) * (point.y - this.y));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

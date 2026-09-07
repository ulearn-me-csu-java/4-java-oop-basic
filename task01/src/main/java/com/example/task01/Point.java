package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        // TODO: реализовать
        this.x = x;
        this.y = y;
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {
        int newX = -this.x;
        int newY = -this.y;

        this.x = newY;
        this.y = newX;
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {
        // TODO: реализовать
        int deltaX = point.x - this.x;
        int deltaY = point.y - this.y;

        return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
    }

    @Override
    public String toString() {
        // TODO: реализовать
        return "(" + this.x + ", " + this.y + ")";
    }
}

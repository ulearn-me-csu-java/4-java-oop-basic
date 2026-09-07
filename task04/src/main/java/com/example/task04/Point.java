package com.example.task04;


/**
 * Класс точки на плоскости (неизменяемый)
 */
public class Point {
    private final int x;
    private final int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     * Возвращает новый объект, а не меняет старый
     */
    public Point flip() {
        return new Point(-this.y, -this.x);
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.x - this.x, 2) + Math.pow(point.y - this.y, 2));
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", x, y);
    }
}

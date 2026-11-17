package com.example.task01;

/**
 * Класс точки на плоскости
 */
public class Point {
    int x;
    int y;

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
    public double distance(Point point) {
        double deltax = this.x - point.x;
        double deltay = this.y - point.y;
        return Math.hypot(deltax, deltay); // метод для формулы пифагора
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }
}

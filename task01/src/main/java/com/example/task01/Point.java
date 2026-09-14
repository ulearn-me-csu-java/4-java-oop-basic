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
        //throw new UnsupportedOperationException("Конструктор не реализован");
    }

    /**
     * "Вращает" точку относительно начала координат на 180 градусов
     */
    public void flip() {
        int temp_x = x;
        this.x = -y;
        this.y = -temp_x;
        //throw new UnsupportedOperationException("Метод flip не реализован");
    }

    /**
     * Считает расстояние от текущей точки до переданной
     *
     * @param point вторая точка
     * @return расстояние между точками
     */
    public double distance(Point point) {
        int dx = this.x - point.x;
        int dy = this.y - point.y;
        return Math.sqrt(dx*dx + dy*dy);

        //throw new UnsupportedOperationException("Метод distance не реализован");
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
        //throw new UnsupportedOperationException("Метод toString не реализован");
    }
}

package com.example.task04;

public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    /**
     * Проверяет, лежит ли точка p на прямой, содержащей текущий отрезок.
     * Используем векторное произведение: (p2-p1) x (p-p1) == 0
     */
    public boolean isCollinearLine(Point p) {
        long dx1 = p2.getX() - p1.getX();
        long dy1 = p2.getY() - p1.getY();
        long dx2 = p.getX() - p1.getX();
        long dy2 = p.getY() - p1.getY();
        return dx1 * dy2 == dy1 * dx2;
    }

    @Override
    public String toString() {
        return "Line{" + p1 + ", " + p2 + "}";
    }
}
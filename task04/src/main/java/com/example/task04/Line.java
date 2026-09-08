package com.example.task04;

/**
 * Класс отрезка между двумя точками
 */
public class Line {
    private final Point p1;
    private final Point p2;

    public Line(Point p1, Point p2) {
        if (p1 == null || p2 == null) {
            throw new IllegalArgumentException("Точки не могут быть null");
        }
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    @Override
    public String toString() {
        return "Line[" + p1 + " - " + p2 + "]";
    }

    /**
     * Проверяет, лежит ли переданная точка на прямой,
     * проходящей через текущий отрезок
     *
     * @param p проверяемая точка
     * @return true, если точка лежит на прямой
     */
    public boolean isCollinearLine(Point p) {
        if (p == null) {
            return false;
        }

        // Используем формулу площади треугольника через определитель
        // Для трех точек (x1,y1), (x2,y2), (x3,y3):
        // (x2-x1)*(y3-y1) - (x3-x1)*(y2-y1) == 0 -> точки коллинеарны

        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        int x3 = p.getX();
        int y3 = p.getY();

        // Вычисляем векторное произведение (cross product)
        long crossProduct = (long)(x2 - x1) * (y3 - y1) - (long)(x3 - x1) * (y2 - y1);

        return crossProduct == 0;
    }

    /**
     * Дополнительный метод: проверяет, лежит ли точка на самом отрезке,
     * а не только на прямой
     */
    public boolean isPointOnSegment(Point p) {
        if (p == null) {
            return false;
        }

        // Сначала проверяем коллинеарность
        if (!isCollinearLine(p)) {
            return false;
        }

        // Затем проверяем, находится ли точка в границах отрезка
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();
        int x3 = p.getX();
        int y3 = p.getY();

        boolean xInRange = (x3 >= Math.min(x1, x2) && x3 <= Math.max(x1, x2));
        boolean yInRange = (y3 >= Math.min(y1, y2) && y3 <= Math.max(y1, y2));

        return xInRange && yInRange;
    }
}
package com.example.task04;

/**
 * Класс отрезка между двумя точками
 */
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
     * Проверяет, лежит ли точка на прямой, содержащей текущий отрезок
     * По формуле (x - x1) / (x2 - x1) = (y - y1) / (y2 - y1)
     */
    public boolean isCollinearLine(Point p) {
        // Если точки отрезка совпадают - проверяем совпадение с точкой
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            return p.getX() == p1.getX() && p.getY() == p1.getY();
        }

        // Проверка через векторное произведение
        int crossProduct = (p2.getX() - p1.getX()) * (p.getY() - p1.getY()) -
                (p2.getY() - p1.getY()) * (p.getX() - p1.getX());

        return crossProduct == 0;
    }

    @Override
    public String toString() {
        return String.format("Line[%s, %s]", p1, p2);
    }
}


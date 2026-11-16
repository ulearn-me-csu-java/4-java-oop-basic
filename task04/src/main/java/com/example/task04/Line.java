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

    @Override
    public String toString() {
        return "Линия от " + p1 + " до " + p2;
    }

    public boolean isCollinearLine(Point p) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p.getX();
        double y3 = p.getY();

        // Вычисляем площадь треугольника (определитель). Если 0 - точки на одной прямой.
        double determinant = (x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3);
        
        // Сравниваем с очень маленьким числом из-за погрешности double
        return Math.abs(determinant) < 1e-9;
    }
}

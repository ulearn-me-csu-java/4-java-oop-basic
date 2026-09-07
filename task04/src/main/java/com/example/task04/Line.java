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

    public boolean isCollinearLine(Point p) {
        double crossProduct = (p2.getX() - p1.getX()) * (p.getY() - p1.getY()) - (p2.getY() - p1.getY()) * (p.getX() - p1.getX()); // формула канонического уравнения прямой, записанная через косое произведение и перенос в одну сторону
        return Math.abs(crossProduct) < 1e-9; // проверка равенства косого произведения нулю с учетом погрешности double
    }

    @Override
    public String toString() {
        return "[" + p1 + " -> " + p2 + "]";
    }
}

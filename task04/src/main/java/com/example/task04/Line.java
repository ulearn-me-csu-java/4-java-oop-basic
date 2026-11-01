package com.example.task04;

public class Line {
    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }
    
    public Point getP2() {
        return p2;
    }

    public boolean isCollinearLine(Point p){
        double dx = p1.getX() - p2.getX();
        double dy = p1.getY() - p2.getY();
        
        double vx = p2.getX() - p.getX();
        double vy = p2.getY() - p.getY();

        return Math.abs(dx * vy - dy * vx) <= 1e-9; //сравнение ч/з формулу косого произведения с учетом погрешности
    }

    @Override  
    public String toString(){
        return "(" + p1 + "; " + p2 + ")";
    }
}

package com.example.task04;

public class Task04Main {
    public static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    public static class Line {
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
            return "Line[" + p1 + " - " + p2 + "]";
        }

        public boolean isCollinearLine(Point p) {
            long x1 = p1.getX();
            long y1 = p1.getY();
            long x2 = p2.getX();
            long y2 = p2.getY();
            long xp = p.getX();
            long yp = p.getY();

            return (x2 - x1) * (yp - y1) == (y2 - y1) * (xp - x1);
        }
    }
    public static void main(String[] args) {

    }
}

package com.example.task04;

public final class Point {
    public final int x;
    public final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
        //throw new UnsupportedOperationException("Метод toString не реализован");
    }
}

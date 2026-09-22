package com.example.task05;

public class Task05Main
{
    public static void main(String[] args)
    {
        PolygonalLine line = new PolygonalLine();
        line.addPoint(0, 0);
        line.addPoint(3, 0);
        line.addPoint(3, 4);
        System.out.println(line.getLength());
    }
}

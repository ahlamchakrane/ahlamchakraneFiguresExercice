package com.example.ahlamchakrane;

public class Point {
    private double X;
    private double Y;

    public Point(double x, double y) {
        X = x;
        Y = y;
    }
    public Point() {
    }
    public void setX(int x) {
        this.X = x;
    }
    public void setY(int y) {
        this.Y = y;
    }
    public double getX() {
        return this.X;
    }
    public double getY() {
        return this.Y;
    }
}

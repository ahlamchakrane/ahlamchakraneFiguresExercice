package com.example.ahlamchakrane.FormesGeometriques;

import java.io.Serializable;

public class Point implements Serializable {
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

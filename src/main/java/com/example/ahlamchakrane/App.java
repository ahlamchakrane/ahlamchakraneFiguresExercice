package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Composite.GroupFigure;

public class App {
    public static void main(String[] args) {
        Point p = new Point(3, 8);
        GroupFigure root = new GroupFigure();
        Figure f = new Cercle("C", "T", 4, p, 66);
        Figure d = new Cercle("C", "T", 4, p, 66);
        root.addFigure(f);
        root.showFigure();
    }
}

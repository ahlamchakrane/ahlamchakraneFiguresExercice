package com.example.ahlamchakrane.FormesGeometriques;

import com.example.ahlamchakrane.Composite.Figure;

public class Cercle extends Figure {
    Point centre;
    private double rayon;

    public Cercle(String couleurContour, String couleurRemplissage, double epaisseurContour, Point centre, double rayon) {
        super(couleurContour, couleurRemplissage, epaisseurContour);
        this.centre = centre;
        this.rayon = rayon;
    }
    @Override
    public double calculePerimetre() {
        return 2*3.14*this.rayon;
    }

    @Override
    public double calculeSurface() {
        return 3.14*Math.pow(this.rayon, 2);
    }
}

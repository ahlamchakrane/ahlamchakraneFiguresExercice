package com.example.ahlamchakrane.FormesGeometriques;

import com.example.ahlamchakrane.Composite.Figure;

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;
    private Point coinSuperieurGauche;
    public Rectangle(String couleurContour, String couleurRemplissage, double epaisseurContour, double largeur, double longueur, Point coinSuperieurGauche) {
        super(couleurContour, couleurRemplissage, epaisseurContour);
        this.largeur = largeur;
        this.longueur = longueur;
        this.coinSuperieurGauche = coinSuperieurGauche;
    }
    @Override
    public double calculePerimetre() {
        return 2* (this.largeur+ this.longueur);
    }

    @Override
    public double calculeSurface() {
        return this.longueur*this.largeur;
    }
}

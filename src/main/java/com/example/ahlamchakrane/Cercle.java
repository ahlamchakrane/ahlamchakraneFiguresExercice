package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Observer.ObjetParametrage;
import com.example.ahlamchakrane.Observer.ObjetParametrageImpl;

public class Cercle extends Element{
    Point centre;
    private double rayon;

    public Cercle(String couleurC, String couleurR, int episseur, Point centre, double rayon) {
        super(couleurC, couleurR, episseur);
        this.centre = centre;
        this.rayon = rayon;
    }

    @Override
    public void update(ObjetParametrage objetParametrage) {
        couleurC = String.valueOf(((ObjetParametrageImpl) objetParametrage).getCouleurC());
        couleurR = String.valueOf(((ObjetParametrageImpl) objetParametrage).getCouleurR());
        episseur = ((ObjetParametrageImpl) objetParametrage).getEpisseur();
        System.out.println("***** OBS Cercle *******");
        System.out.println("******"+couleurC+"******"+couleurR+"******"+episseur);
    }

    @Override
    public double calculePerimetre() {
        return 2*3.14*rayon;
    }

    @Override
    public double calculeSurface() {
        return 3.14*Math.pow(rayon, 2);
    }
}

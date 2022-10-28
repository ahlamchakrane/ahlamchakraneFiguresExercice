package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Observer.ObjetParametrage;
import com.example.ahlamchakrane.Observer.ObjetParametrageImpl;

public class Rectangle extends Element {
    private double longueur;
    private double largeur;

    public Rectangle(String couleurC, String couleurR, int episseur, double largeur, double longueur) {
        super(couleurC, couleurR, episseur);
        this.largeur = largeur;
        this.longueur = longueur;
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
        return 2* (largeur+ longueur);
    }

    @Override
    public double calculeSurface() {
        return longueur*largeur;
    }
}

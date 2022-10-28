package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Observer.ObjetParametrage;

public abstract class Element extends Figure{
    protected String couleurC;
    protected String couleurR;
    protected int episseur;

    public Element(String couleurC, String couleurR, int episseur) {
        this.couleurC = couleurC;
        this.couleurR = couleurR;
        this.episseur = episseur;
    }

    public String getCouleurC() {
        return couleurC;
    }

    public String getCouleurR() {
        return couleurR;
    }

    public int getEpisseur() {
        return episseur;
    }

    public void setCouleurC(String couleurC) {
        this.couleurC = couleurC;
    }

    public void setCouleurR(String couleurR) {
        this.couleurR = couleurR;
    }

    public void setEpisseur(int episseur) {
        this.episseur = episseur;
    }

    public abstract void update(ObjetParametrage objetParametrage);
    public abstract double calculePerimetre();
    public abstract double calculeSurface();

    @Override
    public void showFigure() {
        System.out.println(this.getCouleurC() + " "+ this.getCouleurR()+ " "+ this.getEpisseur());
    }
}

package com.example.ahlamchakrane.Composite;

import com.example.ahlamchakrane.Observer.ObjetParametrage;
import com.example.ahlamchakrane.Observer.ObjetParametrageImpl;
import com.example.ahlamchakrane.Observer.Observer;

import java.io.Serializable;

public abstract class Figure implements Observer, Serializable {
    protected String couleurContour;
    protected String couleurRemplissage;
    protected double epaisseurContour;

    public Figure(String couleurContour, String couleurRemplissage, double epaisseurContour) {
        this.couleurContour = couleurContour;
        this.couleurRemplissage = couleurRemplissage;
        this.epaisseurContour = epaisseurContour;
    }

    public Figure() {
    }

    public String getCouleurContour() {
        return couleurContour;
    }

    public String getCouleurRemplissage() {
        return couleurRemplissage;
    }

    public double getEpaisseurContour() {
        return epaisseurContour;
    }

    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
    }

    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
    }

    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
    }

    public void update(ObjetParametrage objetParametrage){
        String couleurRemplissage = String.valueOf(((ObjetParametrageImpl) objetParametrage).getCouleurRemplissage());
        String couleurContour =String.valueOf(((ObjetParametrageImpl) objetParametrage).getCouleurContour());
        double epaisseur = ((ObjetParametrageImpl) objetParametrage).getEpaisseurContour();
        //pour ne pas ecraser le contenu s'il est vide
        if(((ObjetParametrageImpl) objetParametrage).getCouleurRemplissage() != null)
            this.setCouleurRemplissage(couleurRemplissage);
        if(((ObjetParametrageImpl) objetParametrage).getCouleurContour() != null)
            this.setCouleurContour(couleurContour);
        if(((ObjetParametrageImpl) objetParametrage).getEpaisseurContour() != 0)
            this.setEpaisseurContour(epaisseur);
    }
    public abstract double calculePerimetre();
    public abstract double calculeSurface();


    public void showFigure() {
        System.out.println("\nCouleur du contour: "+ this.getCouleurContour() + "\nCouleur du remplissage: "+ this.getCouleurRemplissage()+ "\nEpaisseur du contour: "+ this.getEpaisseurContour() + "\nPerimetre: "+ this.calculePerimetre()+ "\nSurface: "+ this.calculeSurface());
    }
}

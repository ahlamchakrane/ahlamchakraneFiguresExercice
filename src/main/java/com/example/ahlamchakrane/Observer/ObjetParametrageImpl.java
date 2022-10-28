package com.example.ahlamchakrane.Observer;

import com.example.ahlamchakrane.Composite.Figure;

import java.util.ArrayList;
import java.util.List;

public class ObjetParametrageImpl implements ObjetParametrage{
    private List<Figure> figures = new ArrayList<>();
    private double epaisseurContour;
    private String couleurRemplissage;
    private String couleurContour;
    @Override
    public void notifyObservers() {
        for(Figure figure: figures) {
            figure.update(this);
        }
    }

    @Override
    public void addObserver(Figure figure) {
        this.figures.add(figure);
    }

    @Override
    public void removeObserver(Figure figure) {
        this.figures.remove(figure);
    }
    public void setEpaisseurContour(double epaisseurContour) {
        this.epaisseurContour = epaisseurContour;
        this.notifyObservers();
    }
    public double getEpaisseurContour() {
        return this.epaisseurContour;
    }
    public void setCouleurRemplissage(String couleurRemplissage) {
        this.couleurRemplissage = couleurRemplissage;
        this.notifyObservers();
    }
    public String getCouleurRemplissage() {
        return this.couleurRemplissage;
    }
    public void setCouleurContour(String couleurContour) {
        this.couleurContour = couleurContour;
        this.notifyObservers();
    }
    public String getCouleurContour() {
        return this.couleurContour;
    }
}

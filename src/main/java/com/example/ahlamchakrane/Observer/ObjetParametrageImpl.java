package com.example.ahlamchakrane.Observer;

import com.example.ahlamchakrane.Element;
import com.example.ahlamchakrane.Figure;

import java.util.ArrayList;
import java.util.List;

public class ObjetParametrageImpl implements ObjetParametrage{
    private List<Element> elements = new ArrayList<>();
    private int episseur;
    private int couleurR;
    private int couleurC;
    @Override
    public void notifyObservers() {
        for(Element element: elements) {
            element.update(this);
        }
    }

    @Override
    public void addObserver(Element element) {
        this.elements.add(element);
    }

    @Override
    public void removeObserver(Element element) {
        this.elements.remove(element);
    }
    public void setEpisseur(int episseur) {
        this.episseur = episseur;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }
    public int getEpisseur() {
        return this.episseur;
    }
    public void setCouleurR(int episseur) {
        this.episseur = episseur;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }
    public int getCouleurR() {
        return this.couleurR;
    }
    public void setCouleurC(int couleurR) {
        this.couleurR = couleurR;
        this.notifyObservers(); //une fois l'etat de l'observable se change on notifie les observateurs
    }
    public int getCouleurC() {
        return this.couleurC;
    }
}

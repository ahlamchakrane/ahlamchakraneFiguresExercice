package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Strategy.IStrategy;
import com.example.ahlamchakrane.Strategy.StrategyImpl1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;

public class Dessin {
    private IStrategy strategy= new StrategyImpl1();
    private Collection<Figure> figures = new ArrayList<>();
    public void appliquerStrategy() {
        strategy.traiter();
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    //Les méthodes qui permettent d’ajouter et supprimer des figures du dessin.
    public void addFigure(Figure figure){
        this.figures.add(figure);
    }
    public void deleteFigure(Figure figure){
        this.figures.remove(figure);
    }
    //Une méthode qui permet d’afficher toutes les figures du dessin.
    public void afficher(){
        for(Figure figure: figures){
            if(figure instanceof  Element)
            System.out.println(((Element)figure).getCouleurC()+ " "+ ((Element)figure).getCouleurR()+ ((Element)figure).getEpisseur());
        }
    }
    //Une méthode qui permet de sérialiser le dessin dans un fichier binaire.
    public void serialiser(String filePath) throws IOException {
        File file = new File(filePath);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(this.figures);
        objectOutputStream.close();
        fileOutputStream.close();
    }

    public Collection<Figure> getFigures() {
        return figures;
    }

    public void setFigures(Collection<Figure> figures) {
        this.figures = figures;
    }
}

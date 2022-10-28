package com.example.ahlamchakrane.Composite;

import com.example.ahlamchakrane.Strategy.IStrategy;
import com.example.ahlamchakrane.Strategy.StrategyImpl1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class Dessin extends Figure implements Serializable {
    private IStrategy strategy= new StrategyImpl1();
    private Collection<Figure> figures = new ArrayList<>();
    public void appliquerStrategy() {
        strategy.traiter();
    }
    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }
    public void addFigure(Figure figure){
        this.figures.add(figure);
    }
    public void deleteFigure(Figure figure){
        this.figures.remove(figure);
    }
    //Une méthode qui permet d’afficher toutes les figures du dessin.
    public void afficher(){
        for(Figure figure: figures){
            figure.showFigure();
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

    @Override
    public double calculePerimetre() {
        for (Figure figure : figures){
           return figure.calculePerimetre();
        }
        return 0;
    }

    @Override
    public double calculeSurface() {
        for (Figure figure : figures){
            return figure.calculeSurface();
        }
        return 0;
    }
}

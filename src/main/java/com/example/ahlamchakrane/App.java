package com.example.ahlamchakrane;

import com.example.ahlamchakrane.Composite.Dessin;
import com.example.ahlamchakrane.Composite.Figure;
import com.example.ahlamchakrane.FormesGeometriques.Cercle;
import com.example.ahlamchakrane.FormesGeometriques.Point;
import com.example.ahlamchakrane.FormesGeometriques.Rectangle;
import com.example.ahlamchakrane.Observer.ObjetParametrageImpl;
import com.example.ahlamchakrane.Strategy.IStrategy;
import com.example.ahlamchakrane.Strategy.StrategyImpl1;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        //creation des figures
        Point point = new Point();
        point.setX(1);
        point.setY(3);
        Figure cercle = new Cercle("Red", "Yellow", 1.2, point, 3);
        System.out.print("Cercle");
        cercle.showFigure();

        Point point2= new Point(6, 1.5);
        Figure rectangle = new Rectangle("Orange", "Dark", 1.5, 6, 4, point2);
        System.out.print("\n\nRectangle");
        rectangle.showFigure();
        //partie dessin
        Dessin dessin = new Dessin();
        IStrategy strategy = new StrategyImpl1();
        dessin.setStrategy(strategy);
        dessin.appliquerStrategy(); //affiche message : Traitement 1 de strategy
        dessin.addFigure(cercle);
        dessin.addFigure(rectangle);
        System.out.println("\n\n");
        System.out.println("Surface des figures contenues dans le dessin: " + dessin.calculeSurface());
        System.out.println("Perimetre des figures contenues dans le dessin: " + dessin.calculePerimetre());
        System.out.println("\n\nAffichage des figures de dessins");
        dessin.afficher(); //afficher toutes les figures
        System.out.println("\n\nSupprimer une figure du dessin");
        dessin.deleteFigure(rectangle); //supprimer une figures
        //tester le cas d'un dessin qui cntient un autre dessin
        Dessin dessin2 = new Dessin();
        dessin.setStrategy(strategy);
        dessin.appliquerStrategy();
        dessin2.addFigure(dessin);
        //Obervable
        ObjetParametrageImpl objetParametrage = new ObjetParametrageImpl();
        objetParametrage.addObserver(cercle);
        System.out.println("\n\nNotifier observers des changements On modifie juste un seul attr");
        objetParametrage.setCouleurContour("Pink");

        dessin.afficher();

        objetParametrage.removeObserver(cercle);
        //serialisation
        dessin2.serialiser("fichiers/ahlamChakrane.txt");
    }
}

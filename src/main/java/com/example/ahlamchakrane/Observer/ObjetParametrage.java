package com.example.ahlamchakrane.Observer;

import com.example.ahlamchakrane.Composite.Figure;

public interface ObjetParametrage { //Observable
    void notifyObservers();
    void addObserver(Figure figure);
    void removeObserver(Figure figure);
}

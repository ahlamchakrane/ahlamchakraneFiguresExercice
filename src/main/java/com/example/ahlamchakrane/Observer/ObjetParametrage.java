package com.example.ahlamchakrane.Observer;

import com.example.ahlamchakrane.Element;
import com.example.ahlamchakrane.Figure;

public interface ObjetParametrage {
    void notifyObservers();
    void addObserver(Element element);
    void removeObserver(Element element);
}

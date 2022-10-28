package com.example.ahlamchakrane.Strategy;

import java.io.Serializable;

public class StrategyImpl1 implements IStrategy, Serializable {
    @Override
    public void traiter() {
        System.out.println("Traitement 1 de strategy");
    }
}

package com.example.ahlamchakrane.Composite;

import com.example.ahlamchakrane.Figure;

import java.util.ArrayList;
import java.util.List;

public class GroupFigure extends Figure {
    List<Figure> childs = new ArrayList<>();
    public GroupFigure() {
    }
    public Figure addFigure(Figure figure) {
        childs.add(figure);
        return figure;
    }
    @Override
    public void showFigure() {
        for (Figure f : childs) {
            f.showFigure();
        }
    }
}

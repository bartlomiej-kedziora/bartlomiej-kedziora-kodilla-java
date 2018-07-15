package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {
    private List<Shape> figures = new ArrayList<>();

    public void addFigure(Shape shape) {
        figures.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if(figures.contains(shape)) {
            figures.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if(n >=0 && n < figures.size()) {
            shape = figures.get(n);
        }
        return shape;
    }

    public void showFigures() {
        int i = 0;
        for(Shape val : figures) {
            System.out.println("Figure #" + i++ + val.getShapeName());
        }
    }
}

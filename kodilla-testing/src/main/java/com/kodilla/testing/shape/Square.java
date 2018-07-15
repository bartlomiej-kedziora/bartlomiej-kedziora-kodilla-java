package com.kodilla.testing.shape;

public class Square implements Shape {
    private double a;
    private String name = "square";

    public Square(double a) {
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(a, 2);
    }
}

package com.kodilla.testing.shape;

public class Circle implements Shape {
    private static final double PI = 3.14;
    private String name = "circle";
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return PI * Math.pow(r, 2);
    }
}

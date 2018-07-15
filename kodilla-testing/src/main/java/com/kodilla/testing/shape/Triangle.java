package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double a;
    private double h;
    private String name = "triangle";

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return a * h / 2;
    }
}

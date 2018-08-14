package com.kodilla.spring.intro.shape;

public class Triangle extends Figure {
    @Override
    public String draw() {
        System.out.println("This is a triangle");
        return "This is a triangle";
    }
}

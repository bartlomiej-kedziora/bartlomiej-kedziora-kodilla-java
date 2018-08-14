package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
    @Autowired
    private Display display;
    private static final double ZERO = 0;

    public double add(double a, double b) {
        double val = a + b;

        display.displayValue(val);

        return val;
    }

    public double sub(double a, double b) {
        double val = a - b;

        display.displayValue(val);

        return val;
    }

    public double mul(double a, double b) {
        double val = a * b;

        display.displayValue(val);

        return val;
    }

    public double div(double a, double b) {
        if(b == ZERO) {
            throw new ArithmeticException("Don't divide by zero!");
        }

        double val = a / b;

        display.displayValue(val);

        return val;
    }
}

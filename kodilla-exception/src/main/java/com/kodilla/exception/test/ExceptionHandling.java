package com.kodilla.exception.test;

public class ExceptionHandling {
    SecondChallenge secondChallenge;

    public ExceptionHandling(SecondChallenge secondChallenge) {
        this.secondChallenge = secondChallenge;
    }
    public String test(double x, double y) {
        try {
            String result = secondChallenge.probablyIWillThrowException(x, y);
            return result;
        } catch (Exception e) {
            return "Ups sth went wrong, Error:" + e;
        }
    }

}

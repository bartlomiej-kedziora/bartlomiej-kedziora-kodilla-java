package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        }
        else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int a = 10;
        int b = 7;

        if(calculator.add(a, b) == a + b) {
            System.out.println("Calculator add method OK");
        }
        else {
            System.out.println("Error Calculator add method!");
        }

        if(calculator.subtract(a, b) == a - b) {
            System.out.println("Calculator subtract method OK");
        }
        else {
            System.out.println("Error Calculator subtract method!");
        }


    }
}

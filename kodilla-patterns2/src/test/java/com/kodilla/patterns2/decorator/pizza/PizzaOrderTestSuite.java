package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        Pizza pizza = new BasicPizza();

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        Pizza pizza = new BasicPizza();

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sausage and cheese", description);
    }

    @Test
    public void testPizzaWithDoubleCheeseGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(20), calculatedCost);
    }

    @Test
    public void testPizzaWithDoubleCheeseGetDecoration() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new CheeseDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sausage and cheese + cheese", description);
    }

    @Test
    public void testPizzaWithVegetablesGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new VegetableDecorator(pizza);

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(22), calculatedCost);
    }

    @Test
    public void testPizzaWithVegetablesGetDecoration() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new VegetableDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sausage and cheese + vegetables", description);
    }

    @Test
    public void testPizzaWithVegetablesAndMeatGetCost() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new VegetableDecorator(pizza);
        pizza = new MeatDecorator(pizza);

        //When
        BigDecimal calculatedCost = pizza.getCost();

        //Then
        assertEquals(new BigDecimal(32), calculatedCost);
    }

    @Test
    public void testPizzaWithVegetablesAndMeatGetDecoration() {
        //Given
        Pizza pizza = new BasicPizza();
        pizza = new VegetableDecorator(pizza);
        pizza = new MeatDecorator(pizza);

        //When
        String description = pizza.getDescription();

        //Then
        assertEquals("Pizza with tomato sausage and cheese + vegetables + meat", description);
    }
}

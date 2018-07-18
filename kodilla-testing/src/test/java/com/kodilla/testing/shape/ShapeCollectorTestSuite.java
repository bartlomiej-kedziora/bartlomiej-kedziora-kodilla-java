package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(2);
        ShapeCollector figures = new ShapeCollector();

        //When
        figures.addFigure(circle);

        //Then
        Assert.assertEquals(circle, figures.getFigure(0));
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape square = new Square(4);
        ShapeCollector figures = new ShapeCollector();
        figures.addFigure(square);

        //When
        boolean result = figures.removeFigure(square);

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testgetFigure() {
        //Given
        Shape triangle = new Triangle(5, 6);
        ShapeCollector figures = new ShapeCollector();
        figures.addFigure(triangle);

        //When
        Shape result = figures.getFigure(0);

        //Then
        Assert.assertEquals(triangle, result);
    }
}

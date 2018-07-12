package com.kodilla.testing.collection;

import org.junit.*;
import org.junit.rules.TestName;

import java.util.*;

public class CollectionTestSuite {
    @Rule
    public TestName name = new TestName();

    @Before
    public void before() {
        System.out.println("Currently we're testing: " + name.getMethodName() + " method");
    }

    @After
    public void after() {
        System.out.println("Test has finished.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        List<Integer> actual = one.exterminate(numbers);
        //Then
        Assert.assertTrue(actual.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator one = new OddNumbersExterminator();
        List<Integer> numbers = new ArrayList<>();
        //When
        for(int i= 0; i<10; i++) {
            numbers.add(i);
        }
        List<Integer> actual = one.exterminate(numbers);
        List<Integer> expected = Arrays.asList(0, 2, 4, 6, 8);
        //Then
        Assert.assertEquals(actual, expected);
    }
}

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
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> actual = one.exterminate(numbers);

        Assert.assertTrue(actual.isEmpty());
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator one = new OddNumbersExterminator();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i= 0; i<10; i++) {
            numbers.add(i);
        }

        ArrayList<Integer> actual = one.exterminate(numbers);

        ArrayList<Integer> expected = new ArrayList<>();
        int[] array = new int[]{0,2,4,6,8};
        for(int val : array) {
            expected.add(val);
        }

        Assert.assertEquals(actual, expected);
    }
}

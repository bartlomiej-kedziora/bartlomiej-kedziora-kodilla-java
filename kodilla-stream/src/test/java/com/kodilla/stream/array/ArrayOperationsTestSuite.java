package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = new int[5];
        IntStream.range(0, array.length)
                .forEach(n -> array[n] = n+1);

        //When
        OptionalDouble expected = OptionalDouble.of(3.0);
        OptionalDouble result = ArrayOperations.getAverage(array);

        //Then
        Assert.assertEquals(expected, result);
    }
}

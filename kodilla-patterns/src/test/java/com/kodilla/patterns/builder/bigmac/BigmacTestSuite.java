package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .ingredient("onion")
                .bun("sezam")
                .sauce("standard")
                .ingredient("prons")
                .ingredient("peper")
                .burgers(7)
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        System.out.println(bigmac);
        Assert.assertEquals(3, howManyIngredients);
    }
}

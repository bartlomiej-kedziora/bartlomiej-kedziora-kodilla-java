package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<Country> europe = new ArrayList<>();
        europe.add(new Country(new BigDecimal("100000000000000")));
        europe.add(new Country(new BigDecimal("200000000000000")));
        europe.add(new Country(new BigDecimal("300000000000000")));

        List<Country> america = new ArrayList<>();
        america.add(new Country(new BigDecimal("400000000000000")));
        america.add(new Country(new BigDecimal("500000000000000")));
        america.add(new Country(new BigDecimal("600000000000000")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent(europe));
        continents.add(new Continent(america));

        World world = new World(continents);

        //When
        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("2100000000000000");

        //Then
        Assert.assertEquals(expected, totalPeople);
    }
}

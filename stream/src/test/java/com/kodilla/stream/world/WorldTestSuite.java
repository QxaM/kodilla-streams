package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World Earth = new World();

        Continent Europe = new Continent();
        Europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        Europe.addCountry(new Country("France", new BigDecimal("67500000")));
        Europe.addCountry(new Country("Sweden", new BigDecimal("10420000")));

        Continent Asia = new Continent();
        Asia.addCountry(new Country("Japan", new BigDecimal("125700000")));
        Asia.addCountry(new Country("China", new BigDecimal("12556330000")));
        Asia.addCountry(new Country("Taiwan", new BigDecimal("23570000")));

        Continent SouthAmerica = new Continent();
        SouthAmerica.addCountry(new Country("Salvador", new BigDecimal("6518000")));
        SouthAmerica.addCountry(new Country("Argentina", new BigDecimal("45810000")));
        SouthAmerica.addCountry(new Country("Peru", new BigDecimal("33360000")));

        Earth.addContinent(Europe);
        Earth.addContinent(Asia);
        Earth.addContinent(SouthAmerica);

        //When
        BigDecimal resultPeopleQuantity = Earth.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("12909208000");
        assertEquals(expectedPeopleQuantity, resultPeopleQuantity);
    }
}

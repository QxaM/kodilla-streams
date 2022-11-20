package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        World earth = new World();

        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("40000000")));
        europe.addCountry(new Country("France", new BigDecimal("67500000")));
        europe.addCountry(new Country("Sweden", new BigDecimal("10420000")));

        Continent asia = new Continent();
        asia.addCountry(new Country("Japan", new BigDecimal("125700000")));
        asia.addCountry(new Country("China", new BigDecimal("12556330000")));
        asia.addCountry(new Country("Taiwan", new BigDecimal("23570000")));

        Continent southAmerica = new Continent();
        southAmerica.addCountry(new Country("Salvador", new BigDecimal("6518000")));
        southAmerica.addCountry(new Country("Argentina", new BigDecimal("45810000")));
        southAmerica.addCountry(new Country("Peru", new BigDecimal("33360000")));

        earth.addContinent(europe);
        earth.addContinent(asia);
        earth.addContinent(southAmerica);

        //When
        BigDecimal resultPeopleQuantity = earth.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("12909208000");
        assertEquals(expectedPeopleQuantity, resultPeopleQuantity);
    }
}

package com.techelevator;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class MovieRentalTest extends TestCase {
    public void testGetRentalPrice() {
        //testing price when the movie is premium
        MovieRental movie1 = new MovieRental("Divergent", "DVD", true);
        BigDecimal testPrice = movie1.getRentalPrice();
        BigDecimal expected = new BigDecimal("2.99");
        int result = testPrice.compareTo(expected);
        assertEquals(0, result);

    }
    public void testGetRentalPriceFalsePremium() {
        //testing price when the movie is not premium
        MovieRental movie2 = new MovieRental("Paper Towns", "DVD", false);
        BigDecimal testPrice2 = movie2.getRentalPrice();
        BigDecimal expected2 = new BigDecimal("1.99");
        int result2 = testPrice2.compareTo(expected2);
        assertEquals(0, result2);
    }
}
package com.techelevator;

import java.math.BigDecimal;

public class MovieRental {
    private String title;
    private String format;
    private boolean isPremium;
    private BigDecimal rentalPrice;

    public MovieRental(String title, String format, boolean isPremium) {
        this.title = title;
        this.format = format;
        this.isPremium = isPremium;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
}

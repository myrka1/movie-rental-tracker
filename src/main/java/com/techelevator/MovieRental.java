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

        if(format.equals("VHS")) this.rentalPrice = new BigDecimal("0.99");
        else if(format.equals("DVD")) this.rentalPrice = new BigDecimal("1.99");
        else if(format.contains("Blu")) this.rentalPrice = new BigDecimal("2.99");

        if(isPremium) this.rentalPrice = rentalPrice.add(new BigDecimal("1.00"));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public BigDecimal getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(BigDecimal rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        //"MOVIE - {title} - {format} {rental price}"
        /*return "MovieRental{" +
                "title='" + title + '\'' +
                ", format='" + format + '\'' +
                ", isPremium=" + isPremium +
                ", rentalPrice=" + rentalPrice +
                '}';

         */
        return "MOVIE - " + title +
                " - " + format +
                " " + rentalPrice;
    }
}

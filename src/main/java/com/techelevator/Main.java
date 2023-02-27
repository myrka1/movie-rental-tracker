package com.techelevator;

import java.io.File;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<MovieRental> movies = new ArrayList<>();
    public static void main(String[] args) {
        //System.out.println("Hello World!");
        MovieRental movie1 = new MovieRental("The Hunger Games", "DVD", true);
        System.out.printf("The movie title is: " + movie1.getTitle());

        System.out.println();
        readMoviesFile();
    }

    public BigDecimal lateFee(int daysLate) {
        if(daysLate == 0) return new BigDecimal("0.00");
        else if(daysLate == 1) return new BigDecimal("1.99");
        else if(daysLate == 2) return new BigDecimal("3.99");
        return new BigDecimal("19.99");
    }

    public static List<MovieRental> readMoviesFile() {
        File objFile = new File("MovieInput.csv");
        try (Scanner fileInput = new Scanner(objFile);) {
            while (fileInput.hasNextLine()) {
                String lineOfText = fileInput.nextLine();
                String[] lineOfTextArray = lineOfText.split(",");

                String title = lineOfTextArray[0];
                String format = lineOfTextArray[1];
                boolean premium = Boolean.valueOf(lineOfTextArray[2]);
                MovieRental obj = new MovieRental(title, format, premium);
                movies.add(obj);
            }
        } catch (Exception e) {
            System.out.println("file not found" + objFile.getAbsolutePath());
        }

        BigDecimal total = new BigDecimal("0.00");
        System.out.println();
        for(MovieRental currentMovie : movies) {
            System.out.println(currentMovie.toString());
            total = total.add(currentMovie.getRentalPrice());
        }
        System.out.println("Total price of all movies in the file: " + total);
        return movies;
    }
}
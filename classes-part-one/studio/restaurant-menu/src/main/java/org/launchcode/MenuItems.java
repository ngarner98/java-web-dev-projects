package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItems {
    //fields
    private String name;
    private String description;
    private double price;
    private String category;
    private final LocalDate dateAdded;

    //constructor
    public MenuItems(String name, String description, Double price, String category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.dateAdded = LocalDate.now();
    }

    //Getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public LocalDate getDateAdded() {
        return dateAdded;
    }


    //if item is new
    @Override
    public String toString() {
        String newText = isNew() ? " - New Item!" : "";
        return name + newText + "\n" + description + " - $" + price;
    }



    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }
}

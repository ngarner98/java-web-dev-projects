package org.launchcode;

import java.util.Scanner;
public class Mpg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven?");
        Double numMiles = input.nextDouble();
        System.out.println("How many gallons of gas have you used?");
        Double numGallons = input.nextDouble();

        Double mpg = numMiles / numGallons;
        System.out.println("You are getting " + mpg + " miles per gallon.");
    }
}
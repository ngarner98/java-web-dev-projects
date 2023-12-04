package org.launchcode;

import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a length: ");
        double length = input.nextDouble();
        System.out.println("Enter a width: ");
        double width = input.nextDouble();
        double area = length * width;
        System.out.println("The area of a rectangle with a length of " + length + " and a with a width of " + width + " has an area of " + area);
    }
}

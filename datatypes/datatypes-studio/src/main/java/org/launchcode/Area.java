package org.launchcode;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        //Studio first solution

        Scanner input = new Scanner(System.in);

        // Studio first solution
/*        System.out.println("Enter a radius:");
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
*/
        //Bonus mission 1

/*        System.out.println("Enter a radius:");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();

            if (radius > 0) {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
            } else {
                System.out.println("The radius must be a positive number...");
            }
        } else {
            System.out.println("That is not a valid number...");
        } */

        // Bonus mission 2

        double radius;

        do {
            System.out.println("Enter a positive number for the radius: ");

            while (!input.hasNextDouble()) {
                System.out.println("Enter an actual number: ");
                input.next();
            }
            radius = input.nextDouble();
        } while (radius < 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of a circle with a radius of " + radius + " is: " + area);
    }

}

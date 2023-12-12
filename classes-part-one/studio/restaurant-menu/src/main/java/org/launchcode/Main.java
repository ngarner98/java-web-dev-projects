package org.launchcode;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Menu items
        MenuItems item1 = new MenuItems("Chicken Wings", "Chicken wings with buffalo sauce", 5.99, "appetizer");
        MenuItems item2 = new MenuItems("Mixed Salad", "Mixed greens with your choice of dressing", 3.99, "appetizer");
        MenuItems item3 = new MenuItems("Chicken Alfredo", "Pasta with grilled chicken in a white alfredo sauce", 11.99, "main course");
        MenuItems item4 = new MenuItems("8 oz steak", "8 oz cut of ribeye, grilled to perfection", 16.99, "main course");
        MenuItems item5 = new MenuItems("Tiramisu", "A fluffy coffee flavored treat", 6.99, "dessert");

        //print single item
        System.out.println(item1);

        //create menu
        Menu menu = new Menu();

        //add items to menu
        menu.addItem(item1);
        menu.addItem(item2);
        menu.addItem(item3);
        menu.addItem(item4);
        menu.addItem(item5);

        //print full menu
        System.out.println(menu);

        //remove item and reprint edited menu
        menu.removeItem(item2);
        System.out.println(menu);

    }
}


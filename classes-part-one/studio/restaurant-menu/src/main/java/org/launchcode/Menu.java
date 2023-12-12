package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {

    private ArrayList<MenuItems> menuItems = new ArrayList<>();
    private LocalDate lastUpdated;

    //Default constructor

    //getter
    public ArrayList<MenuItems> getMenuItems() {
        return menuItems;
    }

    //menu layout
    @Override
    public String toString() {
       StringBuilder appetizer = new StringBuilder();
       for (MenuItems item: menuItems) {
           if(item.getCategory().equals("appetizer")) {
               appetizer.append("\n").append(item.toString()).append("\n");
           }
       }
       StringBuilder mainCourse = new StringBuilder();
       for (MenuItems item: menuItems) {
           if(item.getCategory().equals("main course")) {
                mainCourse.append("\n").append(item.toString()).append("\n");
           }
       }
       StringBuilder dessert = new StringBuilder();
       for (MenuItems item: menuItems) {
           if(item.getCategory().equals("dessert")) {
                dessert.append("\n").append(item.toString()).append("\n");
           }
       }
       return "\n RESTAURANT NAME MENU \n" + "APPETIZERS: " + appetizer.toString() + "\n"
               + "MAINS: " + mainCourse.toString() + "\n" + "DESSERTS: " + dessert.toString() + "\n";
    }

    //code to add and remove items from the menu
    void addItem(MenuItems newItem) {
        menuItems.add(newItem);
        lastUpdated = LocalDate.now();
    }

    void removeItem(MenuItems item) {
        menuItems.remove(item);
        lastUpdated = LocalDate.now();
    }

}

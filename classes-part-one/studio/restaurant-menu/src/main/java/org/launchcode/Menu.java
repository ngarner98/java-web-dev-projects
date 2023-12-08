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
}

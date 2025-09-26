package Chapter9.Test;

import Chapter9.Interfaces.MenuComponent;
import Chapter9.Menus.Menu;
import Chapter9.Menus.MenuItems.MenuItemComposition;
import Chapter9.Waitresses.WaitressComposition;
import Chapter9.Waitresses.WaitressIterator;

public class CompositionPattern {
    public static void main(String[] args) {
        // Init all tree nodes of the tree
        MenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
        MenuComponent panCakeMenu = new Menu("PANCAKE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent CafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent desertMenu = new Menu("DESERT MENU", "Desert of course!");

        // Add main child to root
        allMenus.add(panCakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(CafeMenu);

        // Add Diner child to diner menu
        dinerMenu.add(desertMenu);
        // Leaf
        dinerMenu.add(new MenuItemComposition("pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89));
        dinerMenu.add(new MenuItemComposition("steak", "Steak with a side of potatoes", false, 9.89));

        // Waitress prints all menus
        WaitressComposition waitressIterator = new WaitressComposition(allMenus);
        waitressIterator.printMenu();


    }
}

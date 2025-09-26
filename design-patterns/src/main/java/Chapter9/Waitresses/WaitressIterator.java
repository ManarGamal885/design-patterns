package Chapter9.Waitresses;

import Chapter9.Interfaces.Iterator;
import Chapter9.Interfaces.Menu;
import Chapter9.Menus.MenuItems.MenuItemIterator;

public class WaitressIterator {
    public Menu panCakeMenu;
    public Menu dinerMenu;

    public WaitressIterator(Menu panCakeMenu, Menu dinerMenu) {
        this.panCakeMenu = panCakeMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printAllMenus(){
        Iterator panCakeIterator = panCakeMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();

        // Print Pancake Menu
        System.out.println("PANCAKE MENU");
        printSpecificMenu(panCakeIterator);
        // Print Diner Menu
        System.out.println("DINER MENU");
        printSpecificMenu(dinerIterator);
    }

    public void printSpecificMenu(Iterator iterator){
        while (iterator.hasNext()){
            MenuItemIterator menuItemIterator = iterator.next();
            System.out.println("Menu Item: " + menuItemIterator.getName()
                    + "/n" + menuItemIterator.getDescription()
                    + "/n" + menuItemIterator.getPrice() + ", "
                    + (menuItemIterator.isVegetarian() ? "Vegetarian" : "Non-Vegetarian") );
        }
    }
}

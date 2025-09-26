package Chapter9.Menus;

import Chapter9.Interfaces.Iterator;
import Chapter9.Interfaces.Menu;
import Chapter9.Iterators.DinerMenuIterator;
import Chapter9.Menus.MenuItems.MenuItemIterator;

public class DinerMenu implements Menu{
    MenuItemIterator[] menuItemIterators;
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;

    public DinerMenu() {
        menuItemIterators = new MenuItemIterator[MAX_ITEMS];
        addMenuItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addMenuItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addMenuItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addMenuItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
        addMenuItem("Steamed Veggies and Brown Rice", "Steamed vegetables over brown rice", true, 3.99);
        addMenuItem("Pasta", "Spaghetti with Marinara Sauce, and a slice of sourdough bread", true, 3.89);
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItemIterator menuItemIterator = new MenuItemIterator(name, description, vegetarian, price);
        if (numberOfItems < MAX_ITEMS) {
            menuItemIterators[numberOfItems] = menuItemIterator;
            numberOfItems++;
        } else {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        }
    }

    public Iterator createIterator(){
        return new DinerMenuIterator(menuItemIterators);
    }
}

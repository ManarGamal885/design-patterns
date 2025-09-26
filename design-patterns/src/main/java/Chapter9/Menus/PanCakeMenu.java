package Chapter9.Menus;

import Chapter9.Iterators.PanCakeHouseMenuIterator;
import Chapter9.Menus.MenuItems.MenuItemIterator;
import Chapter9.Interfaces.Menu;

import java.util.ArrayList;
import java.util.List;

public class PanCakeMenu implements Menu{
    List<MenuItemIterator> menuItemIterators;

    public PanCakeMenu() {
        menuItemIterators = new ArrayList<>();
        addMenuItem("K&B's Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addMenuItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addMenuItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addMenuItem("Waffles", "Waffles, with your choice of blueberries or strawberries", true, 3.59);
    }

    public void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItemIterator menuItemIterator = new MenuItemIterator(name, description, vegetarian, price);
        menuItemIterators.add(menuItemIterator);
    }

    public PanCakeHouseMenuIterator createIterator(){
        return new PanCakeHouseMenuIterator(menuItemIterators);
    }
}

package Chapter9.Menus;

import Chapter9.Interfaces.MenuComponent;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("---------------------");

        // This is the recursive call to print each menu item
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}

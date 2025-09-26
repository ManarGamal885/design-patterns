package Chapter9.Interfaces;

import Chapter9.Menus.MenuItems.MenuItemIterator;

public interface Iterator {
    public MenuItemIterator next();
    public boolean hasNext();
}

package Chapter9.Iterators;

import Chapter9.Interfaces.Iterator;
import Chapter9.Menus.MenuItems.MenuItemIterator;

import java.util.List;

public class PanCakeHouseMenuIterator implements Iterator {
    List<MenuItemIterator> items;
    int idx = 0;

    public PanCakeHouseMenuIterator(List<MenuItemIterator> items) {
        this.items = items;
    }

    @Override
    public MenuItemIterator next() {
        return items.get(idx++);
    }

    @Override
    public boolean hasNext() {
        return idx < items.size() && items.get(idx) != null;
    }
}

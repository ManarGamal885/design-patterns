package Chapter9.Iterators;

import Chapter9.Interfaces.Iterator;
import Chapter9.Menus.MenuItems.MenuItemIterator;

public class DinerMenuIterator implements Iterator {
    MenuItemIterator[] items;
    int idx = 0;

    public DinerMenuIterator(MenuItemIterator[] items) {
        this.items = items;
    }

    @Override
    public MenuItemIterator next() {
        return items[idx++];
    }

    @Override
    public boolean hasNext() {
        return idx < items.length && items[idx] != null;
    }
}

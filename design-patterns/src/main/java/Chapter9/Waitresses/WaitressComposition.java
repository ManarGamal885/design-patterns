package Chapter9.Waitresses;

import Chapter9.Interfaces.MenuComponent;

public class WaitressComposition {
    MenuComponent allMenus;

    public WaitressComposition(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}

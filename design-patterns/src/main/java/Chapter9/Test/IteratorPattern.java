package Chapter9.Test;

import Chapter9.Menus.DinerMenu;
import Chapter9.Menus.PanCakeMenu;
import Chapter9.Waitresses.WaitressIterator;
public class IteratorPattern {
    public static void main(String[] args) {
        PanCakeMenu panCakeMenu = new PanCakeMenu();
        DinerMenu dinerMenu = new DinerMenu();

        WaitressIterator waitressIterator = new WaitressIterator(panCakeMenu, dinerMenu);
        waitressIterator.printAllMenus();
    }
}

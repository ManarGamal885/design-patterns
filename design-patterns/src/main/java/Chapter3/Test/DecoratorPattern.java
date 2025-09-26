package Chapter3.Test;

import Chapter3.Beverages.Espresso;
import Chapter3.Condiments.Mocha;
import Chapter3.Interfaces.Beverage;

public class DecoratorPattern {
    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        espresso = new Mocha(espresso);
        System.out.println("Description: " + espresso.getDescription() + " | Cost: $" + espresso.cost());
    }
}

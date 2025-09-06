package Chapter4.PizzaStyleStore;

import Chapter4.PizzaTypes.ChicagoStyle.ChicagoCheesePizza;
import Chapter4.PizzaTypes.ChicagoStyle.ChicagoPepperoniPizza;
import Chapter4.PizzaTypes.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if (type.equals("cheese")) {
             return new ChicagoCheesePizza();
        } else if (type.equals("pepperoni")) {
             return new ChicagoPepperoniPizza();
        } else {
            return null;
        }
    }
}

package Chapter4.PizzaStyleStore;

import Chapter4.PizzaTypes.Pizza1;

public abstract class PizzaStore1 {
    public void orderPizza(String type) {
        Pizza1 pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    abstract Pizza1 createPizza(String type);
}

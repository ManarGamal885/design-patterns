package Chapter4.Test;

import Chapter4.PizzaStyleStore.NYStylePizzaStore1;

public class FactoryPattern {
    public static void main(String[] args) {
//        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
//        nyStylePizzaStore.orderPizza("cheese");

        NYStylePizzaStore1 nyStylePizzaStore1 = new NYStylePizzaStore1();
        nyStylePizzaStore1.orderPizza("cheese");
    }
}

package Chapter4.FactoryPattern;

import Chapter4.PizzaStyleStore.NYStylePizzaStore1;

public class Chapter4 {
    public static void main(String[] args) {
//        NYStylePizzaStore nyStylePizzaStore = new NYStylePizzaStore();
//        nyStylePizzaStore.orderPizza("cheese");

        NYStylePizzaStore1 nyStylePizzaStore1 = new NYStylePizzaStore1();
        nyStylePizzaStore1.orderPizza("cheese");
    }
}

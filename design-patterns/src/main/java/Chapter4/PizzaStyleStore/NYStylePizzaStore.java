package Chapter4.PizzaStyleStore;

import Chapter4.PizzaTypes.NYStyle.NYCheesePizza;
import Chapter4.PizzaTypes.NYStyle.NYPepperoniPizza;
import Chapter4.PizzaTypes.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCheesePizza();
        } else if(type.equals("pepperoni")){
            return new NYPepperoniPizza()   ;
        } else {
            return null;
        }
    }
}

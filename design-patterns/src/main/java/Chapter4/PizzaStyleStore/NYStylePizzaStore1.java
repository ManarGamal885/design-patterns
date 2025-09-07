package Chapter4.PizzaStyleStore;

import Chapter4.PizzaIngrediantFactory.NYPizzaIngredientFactory;
import Chapter4.PizzaIngrediantFactory.PizzaIngredientFactory;
import Chapter4.PizzaTypes.NYStyle.NYCheesePizza1;
import Chapter4.PizzaTypes.Pizza1;

public class NYStylePizzaStore1 extends PizzaStore1{
    PizzaIngredientFactory NYIngredientFactory = new NYPizzaIngredientFactory();
    @Override
    Pizza1 createPizza(String type) {
        if(type.equals("cheese")){
            return new NYCheesePizza1(NYIngredientFactory);
        }else {
            return null;
        }
    }
}

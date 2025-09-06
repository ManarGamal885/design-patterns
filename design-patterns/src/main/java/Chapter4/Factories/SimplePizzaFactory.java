package Chapter4.Factories;

import Chapter4.PizzaTypes.GeneralStyle.CheesePizza;
import Chapter4.PizzaTypes.GeneralStyle.PepperoniPizza;
import Chapter4.PizzaTypes.Pizza;

public class SimplePizzaFactory {
    Pizza pizza;
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if(type.equals("pepperoni")){
            pizza = new PepperoniPizza();
        } else {
            pizza = null;
        }
        return pizza;
    }
}

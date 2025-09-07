package Chapter4.PizzaTypes.NYStyle;

import Chapter4.PizzaIngrediantFactory.PizzaIngredientFactory;
import Chapter4.PizzaTypes.Pizza1;

public class NYCheesePizza1 extends Pizza1 {
    PizzaIngredientFactory pizzaIngredientFactory;
    public NYCheesePizza1(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        veggies = pizzaIngredientFactory.createVeggies();
        name = "NY Cheese Pizza";
    }
}

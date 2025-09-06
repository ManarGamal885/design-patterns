package Chapter4.PizzaTypes.NYStyle;

import Chapter4.PizzaTypes.Pizza;

public class NYCheesePizza extends Pizza {
    public NYCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}

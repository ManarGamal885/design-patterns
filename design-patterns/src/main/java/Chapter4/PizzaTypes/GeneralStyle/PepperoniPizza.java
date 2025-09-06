package Chapter4.PizzaTypes.GeneralStyle;

import Chapter4.PizzaTypes.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(){
        name = "General Style Pepperoni Pizza";
        dough = "Regular Crust Dough";
        sauce = "Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Sliced Pepperoni");
        toppings.add("Diced Onion");
        toppings.add("Sliced Mushrooms");
    }
}

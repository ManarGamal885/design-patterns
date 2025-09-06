package Chapter4.PizzaTypes.ChicagoStyle;

import Chapter4.PizzaTypes.Pizza;

public class ChicagoPepperoniPizza extends Pizza {
   public ChicagoPepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Sliced Pepperoni");
   }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

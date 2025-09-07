package Chapter4.PizzaIngrediantFactory;

import Chapter4.Ingrediants.Dough.Dough;
import Chapter4.Ingrediants.Sauce.Sauce;
import Chapter4.Ingrediants.Veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Veggies[] createVeggies();
}

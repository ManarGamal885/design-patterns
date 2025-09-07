package Chapter4.PizzaIngrediantFactory;

import Chapter4.Ingrediants.Dough.CrustDough;
import Chapter4.Ingrediants.Dough.Dough;
import Chapter4.Ingrediants.Sauce.MarinaraSauce;
import Chapter4.Ingrediants.Sauce.Sauce;
import Chapter4.Ingrediants.Veggies.Garlic;
import Chapter4.Ingrediants.Veggies.Onion;
import Chapter4.Ingrediants.Veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{new Garlic(), new Onion()};
    }
}

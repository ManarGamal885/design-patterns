package Chapter4.PizzaTypes;

import Chapter4.Ingrediants.Dough.Dough;
import Chapter4.Ingrediants.Sauce.Sauce;
import Chapter4.Ingrediants.Veggies.Veggies;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza1 {
    public String name;
    public Dough dough;
    public Sauce sauce;
    public Veggies veggies[];

    public abstract void prepare();
    public void bake(){
        System.out.println("Baking " + name + " for 25 minutes at 350");
    }
    public void cut(){
        System.out.println("Cutting " + name + " into diagonal slices");
    }
    public void box(){
        System.out.println("Placing " + name + " in official PizzaStore box");
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}


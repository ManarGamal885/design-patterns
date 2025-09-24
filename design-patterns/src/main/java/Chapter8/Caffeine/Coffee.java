package Chapter8.Caffeine;

import Chapter8.Interfaces.CaffeineBeverage;

public class Coffee extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }
}

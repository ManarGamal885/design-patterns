package Chapter8.Caffeine;

import Chapter8.Interfaces.CaffeineBeverage;

public class Tea extends CaffeineBeverage {
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
}

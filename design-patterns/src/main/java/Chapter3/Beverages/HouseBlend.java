package Chapter3.Beverages;

import Chapter3.Interfaces.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }
    @Override
    public double cost() {
        return 0.89;
    }
}

package Chapter1.Test;

import Chapter1.Behaviors.Flying.FlyNoWay;
import Chapter1.Objects.Duck;
import Chapter1.Objects.MallardDuck;

public class StrategyPattern {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.performFly();
    }
}

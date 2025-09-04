package Chapter1.Behaviors.Flying;

import Chapter1.Interfaces.IFlyBehavior;

public class FlyNoWay implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}

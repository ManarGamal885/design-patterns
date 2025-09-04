package Chapter1.Behaviors.Flying;

import Chapter1.Interfaces.IFlyBehavior;

public class FlyWithWings implements IFlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings!!");
    }
}

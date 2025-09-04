package Chapter1.Behaviors.Quacking;

import Chapter1.Interfaces.IQuackBehavior;

public class Squeak implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak Squeak!!");
    }
}

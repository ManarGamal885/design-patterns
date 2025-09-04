package Chapter1.Behaviors.Quacking;

import Chapter1.Interfaces.IQuackBehavior;

public class Quack implements IQuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack Quack!!");
    }
}

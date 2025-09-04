package Chapter1.Objects;

import Chapter1.Behaviors.Flying.FlyWithWings;
import Chapter1.Behaviors.Quacking.Quack;
import Chapter1.Behaviors.Swiming.Swim;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }
    public void display() {
        System.out.println("I'm a Mallard duck");
    }
}